package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Подключение к базе данных
 */
public class ConnectionURL {

    public static final String URL = "jdbc:sqlite:identifier.sqlite";

    static {
        try {
            DriverManager.registerDriver(new org.sqlite.JDBC());
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * @return подключение
     * @throws SQLException - в случае ошибки получения подключения
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
