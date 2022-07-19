package services;

import domains.tables.Answers;
import domains.tables.Employeeanswers;

import java.util.List;

import static domains.Tables.*;

public class TestingService {

    public static final TestingService TESTING_SERVICE = new TestingService();

    public void startTesting() {
        // запись в таблицу Testing
        //TESTS.TEST_ID.get(); чтение теста
        //TESTS.QUESTIONS.get(); чтение вопросов теста
        //TESTS.ANSWERS.get(); чтение ответов теста
    }

    public void stopTesting() {
        //exit();
    }

    public void confirm(Employeeanswers employeeAnswers) {
        // обработка ответа сотрудника
        //EMPLOYEEANSWERS.EMPLOYEEANSWER.add(employeeAnswers); добавление ответа пользователя
    }
}
