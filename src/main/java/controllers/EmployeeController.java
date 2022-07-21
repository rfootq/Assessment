package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

import static services.EmployeesService.EMPLOYEES_SERVICE;

public class EmployeeController {

    @FXML
    private ComboBox<String> comboBoxEmployees;

    @FXML
    void onClickButtonStart() {
        //EMPLOYEES_SERVICE.selectEmployee();
    }

    @FXML
    void initialize() {
        assert comboBoxEmployees != null : "fx:id=\"comboBoxEmployees\" was not injected: check your FXML file 'login.fxml'.";

        ObservableList<String> langs = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");

        comboBoxEmployees.setItems(langs);

        comboBoxEmployees.setValue("Java"); // устанавливаем выбранный элемент по умолчанию
    }
}
