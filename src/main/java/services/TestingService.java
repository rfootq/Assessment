package services;

import controllers.EmployeeController;
import domains.tables.Employeeanswers;

public class TestingService {

    public static final TestingService TESTING_SERVICE = new TestingService();

    public void startTesting() {
        // запись в таблицу Testing
        //TESTS.TEST_ID.get(); чтение теста
        //TESTS.QUESTIONS.get(); чтение вопросов теста
        //TESTS.ANSWERS.get(); чтение ответов теста
        // отображение экрана тестирования
        EmployeeController employeeController = new EmployeeController();
        employeeController.showWindow();
    }

    public void stopTesting() {
        //exit();
    }

    public void confirm(Employeeanswers employeeAnswers) {
        // обработка ответа сотрудника
        //EMPLOYEEANSWERS.EMPLOYEEANSWER.add(employeeAnswers); добавление ответа пользователя
    }
}
