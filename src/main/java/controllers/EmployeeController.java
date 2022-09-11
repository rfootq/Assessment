package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

import static services.EmployeesService.EMPLOYEES_SERVICE;

public class EmployeeController {

    @FXML
    private ComboBox<String> comboBoxEmployees;

    @FXML
    void onClickButtonStart() {
        String employeeName = comboBoxEmployees.getValue();
        if (employeeName.isEmpty()) {
            return;
        }

        EMPLOYEES_SERVICE.selectEmployee(employeeName);

        comboBoxEmployees.getScene().getWindow().hide();
    }

    @FXML
    void initialize() {
        assert comboBoxEmployees != null : "fx:id=\"comboBoxEmployees\" was not injected: check your FXML file 'login.fxml'.";

        List<String> employees = EMPLOYEES_SERVICE.getEmployeesFromDB();

        comboBoxEmployees.setItems(FXCollections.observableArrayList(employees));
    }

    public void showWindow() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/ui/main.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setMaximized(true);
        stage.show();
    }
}
