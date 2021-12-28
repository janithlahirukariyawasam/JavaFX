package com.example.communicationbetweencontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {

    @FXML
    TextField nameTextField;



    private Scene scene;
    private Stage stage;
    private Parent root;

    public void login(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        root = loader.load();
        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.displayName(nameTextField.getText());
      /*  Scene2Controller scene2Controller = new Scene2Controller();
        scene2Controller.displayName(username);*/
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
