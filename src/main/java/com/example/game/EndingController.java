package com.example.game;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;


public class EndingController implements Initializable {
    @Override public void initialize(URL url, ResourceBundle resourceBundle) {}


    //이벤트
    private Stage pop;


    //버튼
    @FXML private Button gamePopOutBtn;

    //게임 끄기
    @FXML
    private void gamePopOut() {
        pop = (Stage) gamePopOutBtn.getScene().getWindow();
        pop.close();
    }
}
