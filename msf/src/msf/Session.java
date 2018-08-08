package msf;

import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;

public abstract class Session extends Pane {
    
    protected final Pane pane_holder;
    protected final ImageView imageView;
    protected final Pane pane_nameHolder;
    protected final Label label_name;
    
    
    private final String sessionName;
    private String sessionNumber;
    private String userName;
    private String sign;
    
    
    public Session(String name, double x, double y, ImageView imageView) {
        
        sessionName = name;
        pane_holder = new Pane();
        this.setLayoutX(x);
        this.setLayoutY(y);
        
        
        this.imageView = imageView;
        pane_nameHolder = new Pane();
        label_name = new Label();
        
        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(94.0);
        setPrefWidth(96.0);
        setStyle("-fx-background-color: linear-gradient(#f2f2f2, #d6d6d6),        linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%),        linear-gradient(#dddddd 0%, #f6f6f6 50%); -fx-background-radius: 8,7,6; -fx-background-insets: 0,1,2; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        
        pane_holder.setLayoutX(16.0);
        pane_holder.setMaxHeight(USE_PREF_SIZE);
        pane_holder.setMaxWidth(USE_PREF_SIZE);
        pane_holder.setMinHeight(USE_PREF_SIZE);
        pane_holder.setMinWidth(USE_PREF_SIZE);
        pane_holder.setPrefHeight(59.0);
        pane_holder.setPrefWidth(64.0);
        pane_holder.setStyle("-fx-background-color: linear-gradient(#f2f2f2, #d6d6d6),        linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%),        linear-gradient(#dddddd 0%, #f6f6f6 50%); -fx-background-radius: 98,97,96; -fx-background-insets: 0,1,2; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");

        imageView.setFitHeight(56.0);
        imageView.setFitWidth(61.0);
        imageView.setLayoutX(4.0);
        imageView.setLayoutY(2.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);

        
        pane_nameHolder.setLayoutX(6.0);
        pane_nameHolder.setLayoutY(68.0);
        pane_nameHolder.setMaxHeight(USE_PREF_SIZE);
        pane_nameHolder.setMaxWidth(USE_PREF_SIZE);
        pane_nameHolder.setMinHeight(USE_PREF_SIZE);
        pane_nameHolder.setMinWidth(USE_PREF_SIZE);
        pane_nameHolder.setPrefHeight(25.0);
        pane_nameHolder.setPrefWidth(85.0);
        pane_nameHolder.setStyle("-fx-background-color: linear-gradient(#f2f2f2, #d6d6d6),        linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%),        linear-gradient(#dddddd 0%, #f6f6f6 50%); -fx-background-radius: 8,7,6; -fx-background-insets: 0,1,2; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");

        label_name.setLayoutX(15.0);
        label_name.setLayoutY(4.0);
        label_name.setText(sessionName);
        label_name.setFont(new Font("B Yekan", 12.0));

        pane_holder.getChildren().add(imageView);
        getChildren().add(pane_holder);
        pane_nameHolder.getChildren().add(label_name);
        getChildren().add(pane_nameHolder);

        //pane_nameHolder.getChildren().add(imageView);
        
    }
    
    public void Initiate (String sessionNumber,String userName, String sign) {
        this.sessionNumber = sessionNumber;
        this.userName = userName;
        this.sign = sign;
    }

    public void setHandlers(EventHandler handler_contactChoose) {
        
        this.setOnMouseClicked(handler_contactChoose);
        label_name.setOnMouseClicked(handler_contactChoose);
        imageView.setOnMouseClicked(handler_contactChoose);
        pane_holder.setOnMouseClicked(handler_contactChoose);
        pane_nameHolder.setOnMouseClicked(handler_contactChoose);
    }
    
}