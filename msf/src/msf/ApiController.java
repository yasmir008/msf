/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msf;

import java.util.Map;
import msf.models.MsgPackRpc;
import org.json.simple.JSONObject;

/**
 *
 * @author yasmir
 */
public class ApiController {

    private String token;
    private MsgPackRpc msgRpc;

    public ApiController(String token, MsgPackRpc msgPackRpc) {
        this.token = token;
        msgRpc = msgPackRpc;
    }

    public JSONObject getSessionList() {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("session.list", token);

            return json;

        } catch (Exception e) {
            throw e;
        }
    }

    public JSONObject sessionStop(String sessionID) {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("session.stop", token, sessionID);

            return json;

        } catch (Exception e) {
            throw e;
        }

    }

    public JSONObject consoleWrite(String consoleID, String command) {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("console.write", token, consoleID, command);

            return json;

        } catch (Exception e) {
            throw e;
        }

    }

    public JSONObject consoleRead(String consoleID) {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("console.read", token, consoleID);

            return json;

        } catch (Exception e) {
            throw e;
        }

    }

    public JSONObject consoleList() {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("console.list", token);

            return json;

        } catch (Exception e) {
            throw e;
        }

    }

    public JSONObject consoleSessionKill(String ConsoleID) {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("console.session_kill", token, ConsoleID);

            return json;

        } catch (Exception e) {
            throw e;
        }

    }

    public JSONObject consoleCreate() {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("console.create", token);

            return json;

        } catch (Exception e) {
            throw e;
        }

    }

    public JSONObject sessionMeterpreter_Write(String sessionID, String command) {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("session.meterpreter_write", token, sessionID, command);

            return json;

        } catch (Exception e) {
            throw e;
        }

    }

    public JSONObject sessionMeterpreter_Read(String sessionID) {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("session.meterpreter_Read", token, sessionID);

            return json;

        } catch (Exception e) {
            throw e;
        }

    }

    public JSONObject sessionMeterpreter_Run_Single(String sessionID, String command) {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("session.meterpreter_run_single", token, sessionID, command);

            return json;

        } catch (Exception e) {
            throw e;
        }

    }
    //session.meterpreter_script
    public JSONObject sessionMeterpreter_script(String sessionID, String scriptName) {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("session.meterpreter_script", token, sessionID, scriptName);

            return json;

        } catch (Exception e) {
            throw e;
        }

    }      
    
    public JSONObject sessionMeterpreter_session_detach(String sessionID) {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("session.meterpreter_session_detach", token, sessionID);

            return json;

        } catch (Exception e) {
            throw e;
        }

    } 
    
    public JSONObject moduleExecute(String moduleType,String moduleName,Map params) {
        JSONObject json = null;
        try {
            json = msgRpc.rpcCall("module.execute", token, moduleType,moduleName,params);

            return json;

        } catch (Exception e) {
            throw e;
        }

    } 

}
