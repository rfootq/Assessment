package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML
    private Label labelQuestion;

    @FXML
    private TextArea textAreaAnswer;

    @FXML
    void onClickNext() {
        if (!textAreaAnswer.getText().isEmpty()) {
            textAreaAnswer.setText("");
        }
    }
}
