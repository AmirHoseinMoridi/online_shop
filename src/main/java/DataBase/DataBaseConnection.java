package DataBase;


import Util.Config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private Connection connection;

    public Connection getConnection() {
        try {
            this.connection = DriverManager.getConnection(Config.URL, Config.USER_NAME, Config.PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
