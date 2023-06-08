package com.example.moving;

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
        button1.setLayoutX(150);
        button1.setLayoutY(150);
        button2.setLayoutX(300);
        button2.setLayoutY(300);

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


                while (button1.getLayoutY() - button2.getLayoutY() <= 100 && button1.getLayoutY() - button2.getLayoutY() >= 70 && button1.getLayoutY() - button2.getLayoutY() > 0 && Math.abs(button1.getLayoutX() - button2.getLayoutX()) < 100) {
                    button2.setLayoutY(button2.getLayoutY() - 1);
                }
                while (button2.getLayoutY() - button1.getLayoutY() < 100 && button2.getLayoutY() - button1.getLayoutY() >= 70 && button2.getLayoutY() - button1.getLayoutY() > 0 && Math.abs(button2.getLayoutX() - button1.getLayoutX()) < 100) {
                    button2.setLayoutY(button2.getLayoutY() + 1);
                }
                while (button1.getLayoutX() - button2.getLayoutX() <= 100 && button1.getLayoutX() - button2.getLayoutX() >= 70 && button1.getLayoutX() - button2.getLayoutX() > 0 && Math.abs(button2.getLayoutY() - button1.getLayoutY()) < 100) {
                    button2.setLayoutX(button2.getLayoutX() - 1);
                }
                while (button2.getLayoutX() - button1.getLayoutX() < 100 && button2.getLayoutX() - button1.getLayoutX() >= 70 && button2.getLayoutX() - button1.getLayoutX() > 0 && Math.abs(button2.getLayoutY() - button1.getLayoutY()) < 100) {
                    button2.setLayoutX(button2.getLayoutX() + 1);
                }


        });

        button2.setOnMouseDragged(mouseEvent -> {
            button2.setLayoutX(mouseEvent.getSceneX() - coordsOnMousePressed.getX());
            button2.setLayoutY(mouseEvent.getSceneY() - coordsOnMousePressed.getY());

            while (button1.getLayoutY() - button2.getLayoutY() <= 100 && button1.getLayoutY() - button2.getLayoutY() >= 70 && button1.getLayoutY() - button2.getLayoutY() > 0 && Math.abs(button1.getLayoutX() - button2.getLayoutX()) < 100) {
                button1.setLayoutY(button1.getLayoutY() + 1);
            }
            while (button2.getLayoutY() - button1.getLayoutY() < 100 && button2.getLayoutY() - button1.getLayoutY() >= 70 && button2.getLayoutY() - button1.getLayoutY() > 0 && Math.abs(button2.getLayoutX() - button1.getLayoutX()) < 100) {
                button1.setLayoutY(button1.getLayoutY() - 1);
            }
            while (button1.getLayoutX() - button2.getLayoutX() <= 100 && button1.getLayoutX() - button2.getLayoutX() >= 70 && button1.getLayoutX() - button2.getLayoutX() > 0 && Math.abs(button2.getLayoutY() - button1.getLayoutY()) < 100) {
                button1.setLayoutX(button1.getLayoutX() + 1);
            }
            while (button2.getLayoutX() - button1.getLayoutX() < 100 && button2.getLayoutX() - button1.getLayoutX() >= 70 && button2.getLayoutX() - button1.getLayoutX() > 0 && Math.abs(button2.getLayoutY() - button1.getLayoutY()) < 100) {
                button1.setLayoutX(button1.getLayoutX() - 1);
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


