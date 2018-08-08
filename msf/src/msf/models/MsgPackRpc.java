package msf.models;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.msgpack.MessagePack;
import org.msgpack.packer.Packer;
import org.msgpack.type.Value;
import org.msgpack.util.json.JSON;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

// این کلاس برای ارتباط با متااسپلویت از طریق rpc نوشته شده است
public class MsgPackRpc {

    private URL url;
    private URLConnection connection;
    public MsgPackRpc(){
    }
    public Boolean Connect(String host, int port, Boolean isSSL) {
        if (isSSL) {
            // ssl coonect
        } else {
            try {
                // ساخت یک URL
                url = new URL("http", host, port, "/api/1.0");

            } catch (MalformedURLException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /**
     * @param methodName
     * @param args method pass parameters
     * @return JSONObject result
     */
    public JSONObject rpcCall(String methodName,Object... args) {

        JSONObject json = null;
        try {
            connection = url.openConnection();

            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("Content-Type", "binary/message-pack");
            MessagePack msg = new MessagePack();
            try (OutputStream out = connection.getOutputStream()) {
                Packer pack = msg.createPacker(out);
                
                // تبدیل مقادیر به msgpack و افزودن آن به بدنه بسته http و ارسال
                pack.writeArrayBegin(args.length+1);
                pack.write(methodName);
                for (Object arg : args) {
                    pack.write(arg.toString());
                }
                pack.writeArrayEnd();
            }

            // خواندن پاسخ سرور و متااسپلویت
            InputStream is = connection.getInputStream();
            Value val = msg.createUnpacker(is).readValue();

            JSONParser parser = new JSONParser();
            json = (JSONObject) parser.parse(val.toString());


        } catch (IOException | ParseException e) {
        }
        return json;      
    }
}
    
 /*   
     public JSONObject moduleState(String useString, String password) {

        JSONObject json = null;
        try {
            connection = url.openConnection();

            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("Content-Type", "binary/message-pack");
            MessagePack msg = new MessagePack();
            OutputStream out = connection.getOutputStream();
            Packer pack = msg.createPacker(out);

            // تبدیل مقادیر به msgpack و افزودن آن به بدنه بسته http و ارسال
            pack.writeArrayBegin(3);
            pack.write("auth.login");
            pack.write(username);
            pack.write(password);
            pack.writeArrayEnd();
            out.close();

            // خواندن پاسخ سرور و متااسپلویت
            InputStream is = connection.getInputStream();
            Value val = msg.createUnpacker(is).readValue();

            JSONParser parser = new JSONParser();
            json = (JSONObject) parser.parse(val.toString());


        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return json;
    }

}*/
