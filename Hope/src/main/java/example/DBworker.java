package example;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBworker {
    private final String HOST = "jdbc:postgresql://localhost:5432/testdb";
    private final String USERNAME = "testdb";
    private final String PASSWORD = "bX_the_best";
    private Connection connection;
    public DBworker(){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e){

            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
