package repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private String jdbcUserName = "root";
    private String jdbcPassword = "manhhung1999";
    private Connection connection;

    public BaseRepository() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                this.connection = DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPassword);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}
