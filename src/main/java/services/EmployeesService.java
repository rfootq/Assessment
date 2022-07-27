package services;

import com.sun.javafx.collections.ObservableListWrapper;
import database.ConnectionURL;
import domains.Tables;
import domains.tables.Employees;
import domains.tables.records.EmployeesRecord;
import javafx.collections.ObservableList;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.jooq.impl.DSL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesService {

    public static final EmployeesService EMPLOYEES_SERVICE = new EmployeesService();

    public void selectEmployee() {
        // поиск в Roles - админ или не админ
        // если админ - запускаем AdminService
        // иначе - EmployeeService
    }

    public List<String> getEmployeesFromDB() {
        List<String> employees = new ArrayList<>();
        Result<Record1<String>> resultSet;
        DSLContext dsl;
        try {
            dsl = DSL.using(ConnectionURL.getConnection());
            resultSet = dsl.select(Employees.EMPLOYEES.FIRST_NAME)
                    .from(Employees.EMPLOYEES)
                    .orderBy(Employees.EMPLOYEES.EMPLOYEE_ID).fetch();

            List<Record1<String>> result = new ArrayList<>();
            result.addAll(resultSet);

            for (Record1<String> stringRecord1 : result) {
                employees.add(stringRecord1.value1());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return employees;
    }
}
