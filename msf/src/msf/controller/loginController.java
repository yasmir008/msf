/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msf.controller;
import msf.models.MsgPackRpc;
import org.json.simple.JSONObject;

/**
 *
 * @author yasmir
 */
public class loginController {
    
    private String token;
    private MsgPackRpc msg;
    
    
    public loginController(){
        msg = new MsgPackRpc();
    }
    // login function to login into msf
    public void login(String _host,int _port,String _userName,String _password,boolean _isSSL){
        //msg = new MsgPackRpc();
        try {
            msg.Connect(_host, _port, _isSSL);
        } catch (Exception e) {
            // display error 
        }
        JSONObject json = msg.rpcCall("auth.login",_userName,_password);
        if (json.get("result") == "success") {
            token = json.get("token").toString();
            // login to another form
        }
        else if ( Boolean.parseBoolean(json.get("error").toString()) == true) {
            // show the error 
        }
    }
}
