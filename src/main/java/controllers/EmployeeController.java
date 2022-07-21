package controllers;

import domains.tables.records.EmployeesRecord;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

import java.util.List;

import static services.EmployeesService.EMPLOYEES_SERVICE;

public class EmployeeController {

    @FXML
    private ComboBox<EmployeesRecord> comboBoxEmployees;

    @FXML
    void onClickButtonStart() {
        //EMPLOYEES_SERVICE.selectEmployee();
    }

    @FXML
    void initialize() {
        assert comboBoxEmployees != null : "fx:id=\"comboBoxEmployees\" was not injected: check your FXML file 'login.fxml'.";

        List<EmployeesRecord> employeesRecord = EMPLOYEES_SERVICE.getEmployeesFromDB();

        ObservableList<EmployeesRecord> employees = FXCollections.observableArrayList(employeesRecord);

        comboBoxEmployees.setItems(employees);
    }
}
