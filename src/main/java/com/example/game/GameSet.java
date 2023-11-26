package com.example.game;


import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class GameSet implements Initializable {
    @Override public void initialize(URL url, ResourceBundle resourceBundle) {}


    //데이터 타입
    private int remainNumber = 40;


    //텍스트
    @FXML private Text bottleText;
    @FXML private Text radioText;
    @FXML private Text toiletDoor;


    //움직일 오브젝트
    @FXML private Button flowerBottle;
    @FXML private Button mirrorTwo;
    @FXML private Button mirrorGhost;
    @FXML private Button fan;
    @FXML private Button fanTwo;
    @FXML private Pane mirrorText;
    @FXML private Button mannequinBtn;
    @FXML private Button finalGhost;


    //버튼
    @FXML private Button changeBtn_KeepingRoom;
    @FXML private Button changeBtn_FirstRoom;
    @FXML private Button changeBtn_SecondRoom;
    @FXML private Button changeBtn_Toilet;
    @FXML private Button changeBtn_Veranda;
    @FXML private Button changeBtn_GhostAppear;
    @FXML private Button changeBtn_GhostAppearTwo;
    @FXML private Button changeBtn_GhostAppearThree;
    @FXML private Button changeBtn_GhostAppearFour;
    @FXML private Button ghost;
    @FXML private Button bookBtn;
    @FXML private Button lookWindowText;



    //화장실 문열기
    @FXML
    private void toiletDoorBtn() {
        toiletDoor.setText("잠겨있다!");
    }

    //벽에 글씨
    @FXML
    private void lookWindow() {
        lookWindowText.setText("창밖을 봐봐!");
    }

    //책장 클릭
    @FXML
    private void bookShelfClick() {
        TranslateTransition tt = new TranslateTransition();
        tt.setDuration(Duration.seconds(0.5));
        tt.setNode(bookBtn);
        tt.setToY(1063);
        tt.play();
    }


    //책 없애기
    @FXML
    private void moveBookBtn() {
        TranslateTransition tt = new TranslateTransition();
        tt.setDuration(Duration.seconds(0.5));
        tt.setNode(bookBtn);
        tt.setToY(-1063);
        tt.play();
    }


    //움직이는 거울
    @FXML
    private void moveObject() {
        TranslateTransition tt = new TranslateTransition();
        tt.setDuration(Duration.seconds(0.1));
        tt.setNode(mirrorTwo);
        tt.setToX(-300);

        tt.play();
    }


    //움직이는 꽃병
    @FXML
    private void moveObjectTwo() {
        TranslateTransition tt = new TranslateTransition();
        tt.setDuration(Duration.seconds(3));
        tt.setNode(flowerBottle);
        tt.setToX(500);

        tt.play();
    }


    //움직이는 귀신
    @FXML
    private void moveGhost() {
        TranslateTransition tt = new TranslateTransition();
        tt.setDuration(Duration.seconds(1.3));
        tt.setNode(ghost);
        tt.setToX(2300);

        tt.play();
    }


    //움직이는 액자 귀신
    @FXML
    private void movePicture() {
        TranslateTransition tt = new TranslateTransition();
        tt.setDuration(Duration.seconds(0.0001));
        tt.setNode(mirrorGhost);
        tt.setToX(1646);

        tt.play();
    }


    //꽃병 터치
    @FXML
    private
    void bottleTextChange() {
        try {
            if (remainNumber == 1) {
                bottleText.setText("꽃병을 움직여보세요!");
            } else if (remainNumber > 0 ) {
                remainNumber--;
                bottleText.setText(String.valueOf(remainNumber));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //라디오 클릭
    @FXML
    private void radioTextChange() {
        try {
            TranslateTransition tt = new TranslateTransition();
            TranslateTransition ttTwo = new TranslateTransition();

            tt.setDuration(Duration.seconds(0.0001));
            ttTwo.setDuration(Duration.seconds(0.0001));
            tt.setNode(fan);
            ttTwo.setNode(fanTwo);
            tt.setToX(657);
            ttTwo.setToX(-1000);

            tt.play();
            ttTwo.play();

            radioText.setText("라디오가 틀어졌다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //선풍기 클릭
    @FXML
    private void clickFan() {
        TranslateTransition tt = new TranslateTransition();
        TranslateTransition ttTwo = new TranslateTransition();

        tt.setDuration(Duration.seconds(0.0001));
        ttTwo.setDuration(Duration.seconds(0.0001));
        tt.setNode(mirrorText);
        ttTwo.setNode(mannequinBtn);
        tt.setToX(418);
        ttTwo.setToX(1101);

        tt.play();
        ttTwo.play();
    }


    //마네킹 클릭
    @FXML
    private void clickMannequin() {
        TranslateTransition tt = new TranslateTransition();
        tt.setDuration(Duration.seconds(1));
        tt.setNode(finalGhost);
        tt.setToY(1500);

        tt.play();
    }


    //화면전환 (안방 -> 첫번째방)
    @FXML
    private void changeScene_KeepingRoom() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FirstRoom.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_KeepingRoom.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //화면전환 (첫번째방 -> 두번째방)
    @FXML
    private void changeScene_FirstRoom() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SecondRoom.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_FirstRoom.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //화면전환 (두번째방 -> 화장실길)
    @FXML
    private void changeScene_SecondRoom() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Toilet.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_SecondRoom.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //화면전환 (화장실 -> 베란다)
    @FXML
    private void changeScene_Toilet() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Veranda.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_Toilet.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //화면전환 (베란다 -> 창고)
    @FXML
    private void changeScene_Veranda() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WareHouse.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_Veranda.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    //화면전환 (창고 -> 게임클리어)
    @FXML
    private void changeScene_WareHouse() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GameClearScreen.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) finalGhost.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //화면전환 (하민귀신1)
    @FXML
    private void changeScene_GhostAppear() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HaminGhostScreen.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_GhostAppear.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //화면전환 (하민귀신2)
    @FXML
    private void changeScene_GhostAppearTwo() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HaminGhostScreenTwo.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_GhostAppearTwo.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //화면전환 (하민귀신3)
    @FXML
    private void changeScene_GhostAppearThree() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HaminGhostScreenThree.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_GhostAppearThree.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //화면전환 (하민귀신4)
    @FXML
    private void changeScene_GhostAppearFour() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HaminGhostScreenFour.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn_GhostAppearFour.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
