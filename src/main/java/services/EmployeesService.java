package services;

import database.ConnectionURL;
import domains.models.Administrator;
import domains.models.Employee;
import domains.tables.Employees;
import domains.tables.Roles;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.jooq.impl.DSL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesService {

    public static final EmployeesService EMPLOYEES_SERVICE = new EmployeesService();

    public void selectEmployee(String employeeName) {
        // поиск в Employees - по имени сотрудника определяем его роль
        Result<Record1<Integer>> resultSet;
        DSLContext dsl;
        int roleId = -1;
        try {
            dsl = DSL.using(ConnectionURL.getConnection());
            resultSet = dsl.select(Employees.EMPLOYEES.ROLE)
                    .from(Employees.EMPLOYEES)
                    .where(Employees.EMPLOYEES.FIRST_NAME.contains(employeeName)).fetch();

            List<Record1<Integer>> result = new ArrayList<>();
            result.addAll(resultSet);

            for (Record1<Integer> stringRecord1 : result) {
                roleId = stringRecord1.value1();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if (roleId == -1) {
            return;
        }

        // поиск в Roles - админ или не админ
        try {
            dsl = DSL.using(ConnectionURL.getConnection());
            resultSet = dsl.select(Roles.ROLES.IS_ADMINISTRATION)
                    .from(Roles.ROLES)
                    .where(Roles.ROLES.ROLE_ID.contains(roleId)).fetch();

            List<Record1<Integer>> result = new ArrayList<>();
            result.addAll(resultSet);

            for (Record1<Integer> stringRecord1 : result) {
                if (stringRecord1.value1() == 0) {
                    Employee employee = new Employee();
                    employee.setName(employeeName);

                    TestingService.TESTING_SERVICE.startTesting();
                } else {
                    Administrator administrator = new Administrator();
                    administrator.setName(employeeName);

                    //AdminService.ADMIN_SERVICE;
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
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
