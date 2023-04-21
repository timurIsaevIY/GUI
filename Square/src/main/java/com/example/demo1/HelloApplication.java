package com.example.demo1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    double square;
    @Override
    public void start(Stage stage) {
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        TextField textField = new TextField();


        button1.setMinSize(100, 100);
        button1.setMaxSize( 100, 100);
        button2.setMinSize(100, 100);
        button2.setMaxSize( 100, 100);
        button1.setLayoutX(100);

        Pane pane = new Pane();

        pane.getChildren().add(button1);
        pane.getChildren().add(button2);
        pane.getChildren().add(textField);

        CoordsOnMousePressed coordsOnMousePressed = new CoordsOnMousePressed();

        Scene scene = new Scene(pane, 700, 700);


        button1.setOnMousePressed(mouseEvent -> {
            coordsOnMousePressed.setX(mouseEvent.getSceneX() - button1.getLayoutX());
            coordsOnMousePressed.setY(mouseEvent.getSceneY() - button1.getLayoutY());
        });

        button2.setOnMousePressed(mouseEvent -> {
            coordsOnMousePressed.setX(mouseEvent.getSceneX() - button2.getLayoutX());
            coordsOnMousePressed.setY(mouseEvent.getSceneY() - button2.getLayoutY());
        });

        button1.setOnMouseDragged(mouseEvent -> {

            button1.setLayoutX(mouseEvent.getSceneX() - coordsOnMousePressed.getX());
            button1.setLayoutY(mouseEvent.getSceneY() - coordsOnMousePressed.getY());



            });

        button2.setOnMouseDragged(mouseEvent -> {
            button2.setLayoutX(mouseEvent.getSceneX() - coordsOnMousePressed.getX());
            button2.setLayoutY(mouseEvent.getSceneY() - coordsOnMousePressed.getY());
        });

        button1.setOnMouseClicked(mouseEvent -> {
            if (Math.abs(button1.getLayoutX() - button2.getLayoutX()) < 100 && Math.abs(button1.getLayoutY() - button2.getLayoutY()) < 100) {
                square = (100 - Math.abs(button1.getLayoutX() - button2.getLayoutX())) * (100 - Math.abs(button1.getLayoutY() - button2.getLayoutY()));
                textField.setText("S = "+square);
            }
            else {
                textField.setText("s = 0");
            }
        });

        button2.setOnMouseClicked(mouseEvent -> {
            if (Math.abs(button1.getLayoutX() - button2.getLayoutX()) <= 100 && Math.abs(button1.getLayoutY() - button2.getLayoutY()) <= 100) {
                square = (100 - Math.abs(button1.getLayoutX() - button2.getLayoutX())) * (100 - Math.abs(button1.getLayoutY() - button2.getLayoutY()));
                textField.setText("S = "+square);
            }
            else {
                textField.setText("s = 0");
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}