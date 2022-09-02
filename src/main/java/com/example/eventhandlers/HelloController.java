package com.example.eventhandlers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class HelloController implements Initializable {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Label lbl1;

    @FXML
    private BorderPane mainPane;
    private ActionEvent actionEvent;

    public HelloController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lbl1.setText("This is a label to display stuff");

        btn2.setOnAction((e) -> {
            btn2.setText("I fixed myself !!");

        });
        btn1.setOnAction((e) -> {
            lbl1.setText("Did something !!");
        });

    }


    public void doThis(ActionEvent actionEvent) {

    }
}
