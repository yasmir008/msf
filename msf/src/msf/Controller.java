package msf;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.msgpack.MessagePack;
import org.msgpack.packer.Packer;
import org.msgpack.type.Value;
import msf.models.MsgPackRpc;


import javax.swing.*;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class Controller {

    @FXML private TextField txtUserName;
    @FXML private TextField txtHost;
    @FXML private TextField txtPassword;
    @FXML private TextField txtPort;

    @FXML
    private  void connect() throws IOException, ParseException {

        // قسمت اعتبار سنجی ورودی ها هم باید اضافه شود
        // اتصال و لاگین به متااسپبویت
        MsgPackRpc requset = new MsgPackRpc();
        requset.Connect(txtHost.getText().trim(),Integer.parseInt(txtPort.getText().trim()),false);
        JSONObject login_Result_json = requset.login(txtUserName.getText().trim(),txtPassword.getText().trim());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        if (login_Result_json.get("result").toString().equals("success"))
        {
            alert.setContentText("success : " + login_Result_json.get("token").toString() );
            alert.showAndWait();
        }
        else {
            alert.setContentText("failed");
            alert.showAndWait();
        }



    }

}
