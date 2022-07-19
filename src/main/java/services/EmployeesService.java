package services;

public class EmployeesService {

    public static final EmployeesService EMPLOYEES_SERVICE = new EmployeesService();

    public void selectEmployee() {
        // поиск в Roles - админ или не админ
        // если админ - запускаем AdminService
        // иначе - EmployeeService
    }
}
