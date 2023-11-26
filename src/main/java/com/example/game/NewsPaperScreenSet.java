package com.example.game;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class NewsPaperScreenSet implements Initializable {
    @Override public void initialize(URL url, ResourceBundle resourceBundle) {}


    //화면 전환용 버튼
    @FXML private Button changeBtn_MainScreenTwo;


    //돌아가기2 버튼 기능
    @FXML
    private void changeScene_MainScreenTwo() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainScreen.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_MainScreenTwo.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
