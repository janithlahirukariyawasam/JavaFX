package com.example.javafxscenesdrawings;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.SKYBLUE);

        Text text = new Text();
        text.setText("Janith Lahiru");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.GREY);

        Line line  = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(500);
        line.setRotate(0);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(500);
        rectangle.setY(500);
        rectangle.setHeight(50);
        rectangle.setWidth(100);

        Polygon triangle = new Polygon();
        //triangle.getPoints().setAll(
        //         200.0,200.0,
        //         300.0,300.0,
        //         400.0,400.0
        // );
        triangle.setFill(Color.GREY);
        triangle.getPoints().addAll(
                200.0, 200.0,
                300.0, 400.0,
                0.0, 0.0
        );


        Circle circle = new Circle();
        circle.setCenterX(200.0);
        circle.setCenterY(200.0);
        circle.setRadius(50.0);

        Image image = new Image("file:images/img.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(300);
        imageView.setY(300);




        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

        stage.setTitle("Scene & Drawings");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}