package com.example.game;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class MainScreenSet implements Initializable {
    @Override public void initialize(URL url, ResourceBundle resourceBundle) {}

    //화면전환용 버튼
    @FXML private Button changeBtn_Play;
    @FXML private Button changeBtn_HowToPlay;
    @FXML private BorderPane pane;



    //PLAY 버튼 기능
    @FXML
    private void changeScene_Play() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("KeepingRoomScreen.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_Play.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //HOW TO PLAY 버튼 기능
    @FXML
    private void changeScene_HowToPlay() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NewsPaperScreen.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_HowToPlay.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //화면전환용 화면 불러오기
    @FXML
    private void loadPane() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("SubStartScreen.fxml"));
            pane.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
