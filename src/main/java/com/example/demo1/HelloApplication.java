package com.example.demo1;

import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Circle cir = new Circle();
        cir.setFill(Color.RED);
        cir.setRadius(25);
       // cir.relocate(50,50);
        cir.setLayoutX(50);
        cir.setLayoutY(50);
        cir.setStroke(Color.BLACK);
        cir.setStrokeWidth(20);

        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(3));
        transition.setToX(500);
        transition.setToY(500);
        transition.setAutoReverse(true);
        transition.setCycleCount(Animation.INDEFINITE);
        transition.setNode(cir);
        transition.play();

        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(3),cir);
        scaleTransition.setCycleCount(Animation.INDEFINITE);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.play();

        FillTransition fillTransition = new FillTransition(Duration.seconds(3),cir,Color.BLUE, Color.ORANGE);
        fillTransition.setCycleCount(Animation.INDEFINITE);
        fillTransition.setAutoReverse(true);
        fillTransition.play();

        StrokeTransition strokeTransition = new StrokeTransition(Duration.seconds(3),cir,Color.YELLOW, Color.BLACK);
        strokeTransition.setCycleCount(Animation.INDEFINITE);
        strokeTransition.setAutoReverse(true);
        strokeTransition.play();



        Pane root = new Pane();
        root.getChildren().add(cir);
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 620, 540);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}