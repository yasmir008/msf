/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msf;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Samen-Pc
 */
public class MeterpreterController implements Initializable {

    
    
    String[] webcamC = {"record_mic", "webcam_chat", "webcam_list", "webcam_snap", "webcam_stream"};
    
    String[] uiC = {"enumdesktops", "getdesktop", "idletime", "keyscan_dump",
                        "keyscan_start", "keyscan_stop", "screenshot", "setdesktop", "uictl"};
    
    String[] sysC = {"clearev", "drop_token", "execute", "getenv", "getpid", "getprivs",
                        "getsid", "getuid", "kill", "localtime", "pgrep", "pkill", "ps", "reboot",
                            "reg", "rev2self", "shell", "shutdown", "steal_token", "suspend", "sysinfo"};
    
    String[] netC = {"arp", "getproxy", "ifconfig", "ipconfig", "netstat", "portfwd", "resolve", "route"};
    
    String[] fsysC = {"cat", "cd", "checksum", "cp", "dir", "download", "edit", "getlwd", "getwd", "lcd",
                        "lpwd", "ls", "mkdir", "mv", "pwd", "rm", "rmdir", "search", "show_mount", "upload"};
    
    String[] coreC = {"?", "background", "bgkill", "bglist", "bgrun", "channel", "close", "disable_unicode_encoding",
                        "enable_unicode_encoding", "exit", "get_timeouts", "help", "info", "irb", "load", "machine_id",
                            "migrate", "quit", "read", "resource", "run", "sessions", "set_timeouts", "sleep", "transport",
                                    "use", "uuid", "write"};
    
    
    
    @FXML void record_mic_Click (MouseEvent mouseEvent) {}
    
    
    
    
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
