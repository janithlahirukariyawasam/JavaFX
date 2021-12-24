package com.example.test01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,Color.BLACK);
        Image maris = new Image("file:images/marisstella.png");
        stage.getIcons().add(maris);
        stage.setTitle("    Maris Stella College Negambo");
        stage.setScene(scene);
        stage.show();
    }
}