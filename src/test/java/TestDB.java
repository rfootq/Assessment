import database.ConnectionURL;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {

    @Test
    public void testConnectionWorks() throws SQLException {
        Connection connection = ConnectionURL.getConnection();
        Statement statement = connection.createStatement();

        System.out.println(connection.getMetaData().getURL());

        statement.execute("select * from Answers;");
    }
}
