package services;

public class AdminService {

    public static final AdminService ADMIN_SERVICE = new AdminService();

    public void downloadTest() {
        // запись в таблицу Tests
    }

    public void showDocument() {
        // чтение из таблицы Organizations, Branches, Positions и т.п.
        // чтение из таблицы EmployeeAnswers
        // обработка результата и запись в файл-документ
    }
}
