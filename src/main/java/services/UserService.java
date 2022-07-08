package services;

import repositories.UserDAO;

/**
 * Сервис по работе с пользователем
 */
public class UserService {

    private final UserDAO USER_DAO = UserDAO.INSTANCE;
    private final String NAME;

    public UserService(String name) {
        NAME = name;
    }

    /**
     * Сохранение пользователя в файл
     */
    public void saveUser() {
        USER_DAO.saveToFile(NAME);
    }
}