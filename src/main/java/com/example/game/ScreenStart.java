package com.example.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.io.IOException;

public class ScreenStart extends Application {

    public int screenNum = 1;
    @Override public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(ScreenStart.class.getResource("MainScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1010);
        stage.setTitle("[TheFinder]");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}