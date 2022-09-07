package com.example.eventhandlers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
    private Boolean isBlack;

    public HelloController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lbl1.setText("This is text");
        lbl1.autosize();
        lbl1.setAlignment(Pos.CENTER);
        btn2.setText("Set text white");
        btn1.setText("Set text black");
        isBlack = true;
        btn2.setOnAction((event) -> {

            mainPane.setBackground(
                new Background(new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY,
                    Insets.EMPTY)));
            if (isBlack) {
                lbl1.setTextFill(Color.WHITE);
                lbl1.setText("Now I am white");
                isBlack = false;
            }


        });

        btn1.setOnAction((poi) -> {
            mainPane.setBackground(
                new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,
                    Insets.EMPTY)));

            if (!isBlack) {
                lbl1.setTextFill(Color.BLACK);
                lbl1.setText("Now I am black");
                isBlack = true;
            }


        });

    }


    public void doThis() {

    }
}
