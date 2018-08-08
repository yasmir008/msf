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
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class LoginController {

    private String host;
    private int port;
    private String token;
    private MsgPackRpc msgRequest;
    
    public LoginController(){
        msgRequest = new MsgPackRpc();
    }
    
    @FXML
    private Button btnConnect;

    @FXML
    private TextField txtHost;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPort;

    @FXML
    private Button btnCancel;
    
    @FXML
    void cancel(MouseEvent event) {

    }

    @FXML
    void connect(MouseEvent event) {
        // قسمت اعتبار سنجی ورودی ها هم باید اضافه شود
        // اتصال و لاگین به متااسپبویت
        // بررسی خالی نبودن تکست باکس ها و معتبر بودن آن ها
        
        host            = txtHost.getText().trim();
        port            = Integer.parseInt(txtPort.getText().trim());
        String userName = txtUserName.getText().trim();
        String password = txtPassword.getText().trim();
        
        msgRequest.Connect(host,port,false);
        JSONObject login_Result_json = msgRequest.rpcCall(userName,password);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        if (login_Result_json.get("result").toString().equals("success"))
        {
            token = login_Result_json.get("token").toString();
            
            
        }
        else if (Boolean.parseBoolean(login_Result_json.get("error").toString()) == true){
            alert.setContentText("اطلاعات وارد شده صحیح نمیباشد");
            alert.showAndWait();
        }
        else{
            alert.setContentText("خطایی رخ داده استُ");
            alert.showAndWait();
        }

    }
}
