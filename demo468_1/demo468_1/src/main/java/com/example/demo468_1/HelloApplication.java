package com.example.demo468_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override // Override the start method in the Application class
        public void start(Stage primaryStage) {
            ImageView us = new ImageView(new Image("Flag_of_the_United_States.gif"));
            Label lb1 = new Label("US\n50 States", us);
            lb1.setStyle("−fx−border−color: green; −fx-border−width: 2");
            lb1.setContentDisplay(ContentDisplay.BOTTOM);
            lb1.setTextFill(Color.RED);

            Label lb2 = new Label("Circle", new Circle(50, 50, 25));
            lb2.setContentDisplay(ContentDisplay.TOP);
            lb2.setTextFill(Color.ORANGE);

            Label lb3 = new Label("Rectangle", new Rectangle(10, 10, 50, 25));
            lb3.setContentDisplay(ContentDisplay.RIGHT);
            Label lb4 = new Label("Ellipse", new Ellipse(50, 50, 50, 25));
            lb4.setContentDisplay(ContentDisplay.LEFT);
            Ellipse ellipse = new Ellipse(50, 50, 50, 25);
            ellipse.setStroke(Color.GREEN);
            ellipse.setFill(Color.WHITE);
            StackPane stackPane = new StackPane();
            stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));
            Label lb5 = new Label("A pane inside a label", stackPane);
            lb5.setContentDisplay(ContentDisplay.BOTTOM);

            HBox pane = new HBox(20);
            pane.getChildren().addAll(lb1, lb2, lb3, lb4, lb5);

            // Create a scene and place it in the stage
            Scene scene = new Scene(pane, 450, 150);
            primaryStage.setTitle("LabelWithGraphic"); // Set the stage title
            primaryStage.setScene(scene); // Place the scene in the stage
            primaryStage.show();
        }

}
