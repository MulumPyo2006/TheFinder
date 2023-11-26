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


public class SubStartScreenSet implements Initializable {
    @Override public void initialize(URL url, ResourceBundle resourceBundle) {}


    //화면 전환용 버튼
    @FXML private Button changeBtn_GameStart;
    @FXML private Button changeBtn_MainScreen;


    //시작버튼 기능 (ENTER키)
    @FXML
    private void changeScene_GameStart() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("KeepingRoomScreen.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_GameStart.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //돌아가기1 버튼 기능
    @FXML
    private void changeScene_MainScreen() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainScreen.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_MainScreen.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
