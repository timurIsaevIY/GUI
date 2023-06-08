package com.example.hit;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloApplication extends Application {
    double k = 0.01d;

    double player_impulse = 0;
    double circle_impulse = 0;
    double circle_x_vector;
    double circle_y_vector;
    double qw;
    double player_y_vector;
    double player_x_last_position = 50;
    double player_y_last_position = 50;
    boolean player_physics = false;

    public static void main() {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Circle player = new Circle(25);
        Circle circle = new Circle(25);

        player.setCenterX(50);
        player.setCenterY(50);
        player.setFill(Color.BLUE);
        circle.setCenterX(150);
        circle.setCenterY(50);

        player.setOnMouseDragged(event -> {
            player.setCenterX(event.getSceneX());
            player.setCenterY(event.getSceneY());
            double angle = Math.atan2(player_y_last_position - player.getCenterY(), player_x_last_position - player.getCenterX());
            qw = -Math.cos(angle);
            player_y_vector = -Math.sin(angle);
            player_impulse = Math.sqrt(Math.pow(player_x_last_position - player.getCenterX(), 2) + Math.pow(player_y_last_position - player.getCenterY(), 2));
            player_x_last_position = event.getSceneX();
            player_y_last_position = event.getSceneY();
            System.out.println();
        });
        player.setOnMousePressed(event -> {
            player_physics = false;
        });
        player.setOnScroll(event -> {
            player.setRadius(player.getRadius()-event.getDeltaY()*0.5);
        });
        player.setOnMouseReleased(event -> {
            player_physics = true;
        });


        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(10),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                System.out.print(player_impulse);
                                System.out.print(" ");
                                System.out.println(circle_impulse);
                                // Проверяем, ушла ли шайба за границу
                                if (circle.getCenterX() + circle.getRadius() > root.getWidth()) {
                                    circle.setCenterX(root.getWidth() - circle.getRadius());
                                    circle_x_vector *= -1;
                                }
                                if (circle.getCenterX() - circle.getRadius() < 0) {
                                    circle.setCenterX(circle.getRadius());
                                    circle_x_vector *= -1;
                                }
                                if (circle.getCenterY() + circle.getRadius() > root.getHeight()) {
                                    circle.setCenterY(root.getHeight() - circle.getRadius());
                                    circle_y_vector *= -1;
                                }
                                if (circle.getCenterY() - circle.getRadius() < 0) {
                                    circle.setCenterY(circle.getRadius());
                                    circle_y_vector *= -1;
                                }
                                // Проверяем, ушёл ли игрок за границу
                                if (player.getCenterX() + player.getRadius() > root.getWidth()) {
                                    player.setCenterX(root.getWidth() - player.getRadius());
                                    qw *= -1;
                                }
                                if (player.getCenterX() - player.getRadius() < 0) {
                                    player.setCenterX(player.getRadius());
                                    qw *= -1;
                                }
                                if (player.getCenterY() + player.getRadius() > root.getHeight()) {
                                    player.setCenterY(root.getHeight() - player.getRadius());
                                    player_y_vector *= -1;
                                }
                                if (player.getCenterY() - player.getRadius() < 0) {
                                    player.setCenterY(player.getRadius());
                                    player_y_vector *= -1;
                                }

                                double dk = player.getRadius() + circle.getRadius();

                                double distance = Math.sqrt(Math.pow(player.getCenterX() - circle.getCenterX(), 2) + Math.pow(player.getCenterY() - circle.getCenterY(), 2));
                                if (distance < dk) {
                                    double angle = Math.atan2(circle.getCenterY() - player.getCenterY(), circle.getCenterX() - player.getCenterX());
                                    circle_x_vector = Math.cos(angle);
                                    circle_y_vector = Math.sin(angle);
                                    qw = -circle_x_vector;
                                    player_y_vector = -circle_y_vector;
                                    if (player_physics){
                                        double t = circle_impulse;
                                        circle_impulse = (circle_impulse+player_impulse)/2;
                                        player_impulse = (t+player_impulse)/2;
                                    }
                                    else {
                                        circle_impulse = Math.sqrt((dk - distance));
                                    }
                                }
                                // Двигаем по импульсу и замедляем его
                                circle_impulse = Math.max(0, circle_impulse - k);
                                circle.setCenterX(circle.getCenterX() + circle_x_vector * circle_impulse);
                                circle.setCenterY(circle.getCenterY() + circle_y_vector * circle_impulse);
                                if (player_physics) {
                                    // Двигаем по импульсу и замедляем его
                                    player_impulse = Math.max(0, player_impulse - k);
                                    player.setCenterX(player.getCenterX() + qw * player_impulse);
                                    player.setCenterY(player.getCenterY() + player_y_vector * player_impulse);
                                }
                            }
                        }
                ));

        root.getChildren().addAll(player, circle);

        Scene scene = new Scene(root, 600, 500);

        primaryStage.setTitle("Хочу кушац");
        primaryStage.setScene(scene);
        primaryStage.show();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}