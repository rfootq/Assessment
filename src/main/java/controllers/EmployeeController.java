package controllers;

import com.sun.javafx.collections.ObservableListWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import org.jooq.Record1;

import java.util.ArrayList;
import java.util.List;

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

        List<String> employees = EMPLOYEES_SERVICE.getEmployeesFromDB();

        comboBoxEmployees.setItems(FXCollections.observableArrayList(employees));
    }
}
