/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import msf.ApiController;
import msf.models.MsgPackRpc;
import org.json.simple.JSONObject;

/**
 *
 * @author yasmir
 */
public class useCases {
    
    private String token;
    MsgPackRpc msg;
    ApiController api;
    
    public useCases(){
        msg = new MsgPackRpc();
        api = new ApiController(token, msg);
    }
    
    public void deviceSessionList()
    {
        
    }
    
    
    public void createHandler(String _host,String _lhost,String _lport,String _payload){
        Map params = new HashMap();
        params.put("LHOST", _lhost);
        params.put("LPORT", _lport);        
        params.put("PAYLOAD", _payload);

        JSONObject job_id = api.moduleExecute("exploit", "exploit/handler",params);
    }
    
    public JSONObject Login(String _host,int _port , String _userName ,String _password){
        msg.Connect(_host,_port,false);
        JSONObject login_Result_json = msg.rpcCall("auth.login",_userName,_password);
        return login_Result_json;
    }
    
}
