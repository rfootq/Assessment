package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static services.EmployeesService.EMPLOYEES_SERVICE;

public class EmployeeController {

    @FXML
    private TextField textFieldUsername;

    @FXML
    void onClickButtonStart() {
        if (!textFieldUsername.getText().isEmpty()) {
            textFieldUsername.setText("");
        }

        EMPLOYEES_SERVICE.selectEmployee();
    }
}
