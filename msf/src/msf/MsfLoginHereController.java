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
public class MsfLoginHereController implements Initializable {

    
    @FXML JFXButton btn_shonud;
    
    private BIL bil;
    
    
    public void setBIL (BIL bil) {
        this.bil = bil;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
    
    @FXML void EsteragSam (MouseEvent mouseEvent) {
        //System.out.println(bil.token);
    }
    
}
