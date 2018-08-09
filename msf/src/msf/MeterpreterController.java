/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msf;

import com.jfoenix.controls.JFXButton;
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
    
    
    
    @FXML
    private JFXButton btn_webcam_list;

    @FXML
    void record_mic_Click(MouseEvent event) {
        
    }

    

    @FXML
    void webcam_chat_Click(MouseEvent event) {

    }

    

    @FXML
    void webcamChat_Click(MouseEvent event) {

    }


    @FXML
    void webcamSnap_Click(MouseEvent event) {

    }

    

    @FXML
    void webcamStream_Click(MouseEvent event) {

    }


    @FXML
    void enumdesktop_Click(MouseEvent event) {

    }


    @FXML
    void getdesktop_Click(MouseEvent event) {

    }


    @FXML
    void idletime_Click(MouseEvent event) {

    }

    @FXML
    void keyscandump_Click(MouseEvent event) {

    }


    @FXML
    void keyscanstart_Click(MouseEvent event) {

    }


    @FXML
    void keyscanstop_Click(MouseEvent event) {

    }


    @FXML
    void screenshot_Click(MouseEvent event) {

    }


    @FXML
    void setdesktop_Click(MouseEvent event) {

    }

    @FXML
    void uictl_click(MouseEvent event) {

    }


    @FXML
    void ps_Click(MouseEvent event) {

    }


    @FXML
    void pgrep_Click(MouseEvent event) {

    }


    @FXML
    void localtime_Click(MouseEvent event) {

    }

    @FXML
    void kill_Click(MouseEvent event) {

    }


    @FXML
    void getuid_Click(MouseEvent event) {

    }


    @FXML
    void getsid_Click(MouseEvent event) {

    }


    @FXML
    void getprivs_Click(MouseEvent event) {

    }


    @FXML
    void getpid_Click(MouseEvent event) {

    }


    @FXML
    void getenv_Click(MouseEvent event) {

    }


    @FXML
    void execute_Click(MouseEvent event) {

    }

    
    @FXML
    void droptoken_Click(MouseEvent event) {

    }


    @FXML
    void clearev_Click(MouseEvent event) {

    }


    @FXML
    void reboot_Click(MouseEvent event) {

    }

    

    @FXML
    void reg_Click(MouseEvent event) {

    }

    

    @FXML
    void rev2self_Click(MouseEvent event) {

    }

    

    @FXML
    void shell_Click(MouseEvent event) {

    }

    

    @FXML
    void sysInfo_Click(MouseEvent event) {

    }

    

    @FXML
    void suspend_Click(MouseEvent event) {

    }

    

    @FXML
    void stealToken_Click(MouseEvent event) {

    }

    

    @FXML
    void shutdown_Click(MouseEvent event) {

    }

    

    @FXML
    void arp_Click(MouseEvent event) {

    }

    

    @FXML
    void getProxy_Click(MouseEvent event) {

    }

    

    @FXML
    void ifconfig_Click(MouseEvent event) {

    }

    

    @FXML
    void ipconfig_Click(MouseEvent event) {

    }

    

    @FXML
    void netstat_Click(MouseEvent event) {

    }

    

    @FXML
    void portFwd_Click(MouseEvent event) {

    }

    

    @FXML
    void resolve_Click(MouseEvent event) {

    }

    

    @FXML
    void route_Click(MouseEvent event) {

    }

    

    @FXML
    void getlwd_Click(MouseEvent event) {

    }

    

    @FXML
    void edit_Click(MouseEvent event) {

    }

    

    @FXML
    void download_Click(MouseEvent event) {

    }

    

    @FXML
    void dir_Click(MouseEvent event) {

    }

    

    @FXML
    void cp_Click(MouseEvent event) {

    }

    

    @FXML
    void checksum_Click(MouseEvent event) {

    }

    

    @FXML
    void cd_Click(MouseEvent event) {

    }

    

    @FXML
    void cat_Click(MouseEvent event) {

    }

    

    @FXML
    void rm_Click(MouseEvent event) {

    }

    

    @FXML
    void pwd_Click(MouseEvent event) {

    }

    

    @FXML
    void mv_Click(MouseEvent event) {

    }

    

    @FXML
    void mkdir_Click(MouseEvent event) {

    }

    

    @FXML
    void ls_Click(MouseEvent event) {

    }

    

    @FXML
    void lpwd_Click(MouseEvent event) {

    }

    

    @FXML
    void lcd_Click(MouseEvent event) {

    }

    

    @FXML
    void getwd_Click(MouseEvent event) {

    }

    

    @FXML
    void upload_Click(MouseEvent event) {

    }

    

    @FXML
    void showMount_Click(MouseEvent event) {

    }

    

    @FXML
    void search_Click(MouseEvent event) {

    }

    

    @FXML
    void rmdir_Click(MouseEvent event) {

    }

    

    @FXML
    void help_Click(MouseEvent event) {

    }

    

    @FXML
    void background_Click(MouseEvent event) {

    }

    

    @FXML
    void bgkill_Click(MouseEvent event) {

    }

    

    @FXML
    void bglist_Click(MouseEvent event) {

    }

    

    @FXML
    void bgrun_Click(MouseEvent event) {

    }

    

    @FXML
    void channel_Click(MouseEvent event) {

    }

    

    @FXML
    void close_Click(MouseEvent event) {

    }

    

    @FXML
    void dis_unicode_Click(MouseEvent event) {

    }

    

    @FXML
    void en_unicode_Click(MouseEvent event) {

    }

    

    @FXML
    void exit_Click(MouseEvent event) {

    }

    

    @FXML
    void gettimeouts_Click(MouseEvent event) {

    }

    

    @FXML
    void help2_Click(MouseEvent event) {

    }

    

    @FXML
    void info_Click(MouseEvent event) {

    }

    

    @FXML
    void irb_Click(MouseEvent event) {

    }

    

    @FXML
    void load_Click(MouseEvent event) {

    }

    

    @FXML
    void machineId_Click(MouseEvent event) {

    }

    

    @FXML
    void migrate_Click(MouseEvent event) {

    }

    

    @FXML
    void quit_Click(MouseEvent event) {

    }

    

    @FXML
    void read_Click(MouseEvent event) {

    }

    

    @FXML
    void resource_Click(MouseEvent event) {

    }

    

    @FXML
    void run_Click(MouseEvent event) {

    }

    

    @FXML
    void sessions_Click(MouseEvent event) {

    }

    

    @FXML
    void settimeouts_Click(MouseEvent event) {

    }

    

    @FXML
    void sleep_Click(MouseEvent event) {

    }

    

    @FXML
    void transport_Click(MouseEvent event) {

    }

    

    @FXML
    void use_Click(MouseEvent event) {

    }

    

    @FXML
    void uuid_Click(MouseEvent event) {

    }

    

    @FXML
    void write_Click(MouseEvent event) {

    }

    
    
    
    
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
