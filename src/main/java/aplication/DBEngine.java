package aplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBEngine {

    private Connection connection;

    public DBEngine(){
        connection = connect();
    }
    public boolean isConnected() {
        return (connection != null);
    }

    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/workClothesDB" + "?" +
                "useUnicode=yes" + "&" +
                "characterEncoding=UTF-8";

        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "Riddick84");

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            return null;
        }
    }
}
