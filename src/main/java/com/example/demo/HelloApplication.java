package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public void start(Stage stage) throws Exception{
        stage.setScene(new Scene(createContent(),300,300));
        stage.show();
    }

    private Parent createContent() {
        return new StackPane(new Text("hello"));
    }

    public static void main(String[] args) {
        launch();
    }
}