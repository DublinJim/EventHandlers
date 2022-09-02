package com.example.eventhandlers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

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
    private Boolean notBlack;

    public HelloController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lbl1.setText("This is a label to display stuff");

        btn2.setOnAction((event) -> {
            btn2.setText("I fixed myself !!");
            mainPane.setBackground(
                new Background(new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY,
                    Insets.EMPTY)));
            lbl1.setTextFill(Color.WHITE);
            notBlack=true;
        });
        btn1.setOnAction((poi) -> {
            lbl1.setText("Did something !!");
            if (notBlack) {
                lbl1.setTextFill(Color.BLACK);
                notBlack=false;
            }
        });

    }


    public void doThis(ActionEvent actionEvent) {

    }
}
