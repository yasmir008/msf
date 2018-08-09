/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msf;

import com.jfoenix.controls.JFXButton;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Samen-Pc
 */
public class MsfLoginHereController implements Initializable {

    @FXML
    JFXButton btn_shonud;
    @FXML
    AnchorPane pane;

    private BIL bil;

    public void setBIL(BIL bil) {
        this.bil = bil;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void EsteragSam(MouseEvent mouseEvent) {

        //thread here
        Thread thr = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //System.out.println(bil.token);
                    String consoleID = bil.createHandler("10.20.21.123", "4444", "windows/meterpreter/reverse_tcp");
                    if (consoleID != null) {
                        // open meterpreter form to cumminate user with it
                    }
                } catch (InterruptedException ex) {
                    //view errors to user
                    Logger.getLogger(MsfLoginHereController.class.getName()).log(Level.SEVERE, null, ex);
                }

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("مژده");
                        alert.setContentText("نشست جدید با موفقیت باز شد");
                        alert.showAndWait();
                    }
                });
                /*
                ImageView imageView = new ImageView();
                File file = new File("src/back.png");
                Image image = new Image(file.toURI().toString());
                imageView.setImage(image);

                Session sampleSession
                        = new Session("Android Device", 10, 20, imageView) {
                };

                pane.getChildren().add(sampleSession);*/
            }
        });
        thr.start();

    }

}
