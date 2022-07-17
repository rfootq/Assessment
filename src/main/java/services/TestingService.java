package services;

import static domains.Tables.EMPLOYEES;
import static domains.Tables.TESTS;

public class TestingService {

    public static final TestingService TESTING_SERVICE = new TestingService();

    public void startTesting() {
        //TESTS.TEST_ID.get(); чтение теста
        //TESTS.QUESTIONS.get(); чтение вопросов теста
    }

    public void stopTesting() {
        //EMPLOYEES.EMPLOYEE_ID.add(); добавление сотрудника, прошедшего тест
        //расчет записанных ответов - с учетом правильных и неправильных ответов
    }

    public void nextQuestion() {
        //ANSWERS.ANSWER.add(); добавление ответа пользователя
    }

}
