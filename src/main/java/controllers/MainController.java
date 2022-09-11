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
    void onClickBeginTesting() {
        if (!textAreaAnswer.getText().isEmpty()) {
            textAreaAnswer.setText("");
        }

        //TESTING_SERVICE.startTesting();
    }

    public void stop() {
        //TESTING_SERVICE.stopTesting();
    }

    public void confirm() {
        //Employeeanswers employeeAnswers = new Employeeanswers();
        //TESTING_SERVICE.confirm(employeeAnswers);
    }
}
