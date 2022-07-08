package repositories;

/**
 * Работа с файлом пользователя
 */
public class UserDAO extends FileDAOImpl implements FileDAO {

    public static UserDAO INSTANCE = new UserDAO("users.txt");

    private UserDAO(String fileName) {
        super(fileName);
    }
}