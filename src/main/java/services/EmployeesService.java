package services;

import domains.Tables;
import domains.tables.Employees;
import domains.tables.records.EmployeesRecord;

import java.util.ArrayList;
import java.util.List;

public class EmployeesService {

    public static final EmployeesService EMPLOYEES_SERVICE = new EmployeesService();

    public void selectEmployee() {
        // поиск в Roles - админ или не админ
        // если админ - запускаем AdminService
        // иначе - EmployeeService
    }

    public List<EmployeesRecord> getEmployeesFromDB() {
        List<EmployeesRecord> employees = new ArrayList<>();

        employees.add(new EmployeesRecord());

        return employees;
    }
}
