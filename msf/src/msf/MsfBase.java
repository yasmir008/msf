package msf;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public abstract class MsfBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final Button button;
    protected final TextField txtHost;
    protected final TextField txtPassword;
    protected final Label label;
    protected final TextField txtUserName;
    protected final Label label0;
    protected final Label label1;
    protected final TextField txtPort;
    protected final Label label2;
    protected final Button button0;

    public MsfBase() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        button = new Button();
        txtHost = new TextField();
        txtPassword = new TextField();
        label = new Label();
        txtUserName = new TextField();
        label0 = new Label();
        label1 = new Label();
        txtPort = new TextField();
        label2 = new Label();
        button0 = new Button();

        setAlignment(javafx.geometry.Pos.CENTER);
        setHgap(10);
        setVgap(10);





        GridPane.setHalignment(button, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(button, 6);
        button.setMnemonicParsing(false);
        button.setOnMouseClicked(this::connect);
        button.setText("?????");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(button, new Insets(0.0));
        button.setPadding(new Insets(5.0, 20.0, 5.0, 20.0));

        GridPane.setRowIndex(txtHost, 2);
        txtHost.setId("txtHost");

        GridPane.setRowIndex(txtPassword, 1);
        txtPassword.setId("txtPassword");

        GridPane.setColumnIndex(label, 1);
        GridPane.setHalignment(label, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(label, 2);
        label.setText("???? :");
        GridPane.setMargin(label, new Insets(0.0, 0.0, 0.0, 10.0));

        txtUserName.setId("txtUserName");

        GridPane.setColumnIndex(label0, 1);
        GridPane.setHalignment(label0, javafx.geometry.HPos.RIGHT);
        label0.setText("??? ?????? :");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(label0, new Insets(0.0, 0.0, 0.0, 10.0));

        GridPane.setColumnIndex(label1, 1);
        GridPane.setHalignment(label1, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(label1, 1);
        label1.setText("??? ???? : ");
        GridPane.setMargin(label1, new Insets(0.0, 0.0, 0.0, 10.0));

        GridPane.setRowIndex(txtPort, 3);
        txtPort.setId("txtPort");

        GridPane.setColumnIndex(label2, 1);
        GridPane.setHalignment(label2, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(label2, 3);
        label2.setText("???? :");
        GridPane.setMargin(label2, new Insets(0.0, 0.0, 0.0, 10.0));

        GridPane.setRowIndex(button0, 6);
        button0.setMnemonicParsing(false);
        button0.setText("??????");
        button0.setPadding(new Insets(5.0, 10.0, 5.0, 10.0));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getRowConstraints().add(rowConstraints5);
        getChildren().add(button);
        getChildren().add(txtHost);
        getChildren().add(txtPassword);
        getChildren().add(label);
        getChildren().add(txtUserName);
        getChildren().add(label0);
        getChildren().add(label1);
        getChildren().add(txtPort);
        getChildren().add(label2);
        getChildren().add(button0);

    }

    protected abstract void connect(javafx.scene.input.MouseEvent mouseEvent);

}
