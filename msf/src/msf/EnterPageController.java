/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msf;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import msf.models.MsgPackRpc;
import org.json.simple.JSONObject;

/**
 * FXML Controller class
 *
 * @author Samen-Pc
 */
public class EnterPageController implements Initializable {

    private String host;
    private int port;
    private String token;
    private BIL useCase;
    
    public EnterPageController(){
        useCase = new BIL();
    }
    
    @FXML
    private JFXTextField txtUserName;
    
    @FXML
    private JFXPasswordField txtPassword;
    
    @FXML
    private JFXTextField txtHost;
    
    @FXML
    private JFXTextField txtPort;
        
    @FXML
    private JFXButton btnConnect;

    

    


    //@FXML    private JFXButton btnCancel;
    
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
        
        JSONObject login_Result_json = useCase.Login(host, port, userName, password);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        if (login_Result_json.get("result").toString().equals("success"))
        {
            token = login_Result_json.get("token").toString();
            alert.setContentText("OK:)");
            
            
            // show the original windows and pass the token with usecse;
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
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
