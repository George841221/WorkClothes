package aplication;

import models.Employs;
import models.Position;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class DBEngine {

    private Connection connection;
    private boolean botton;

    public DBEngine(){
        connection = connect();
        this.botton = botton;
    }

    public boolean isBotton() {
        return botton;
    }

    public boolean isConnected() {
        return (connection != null);
    }

    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/workClothesDB" + "?" +
                "useUnicode=yes" + "&" +
                "characterEncoding=UTF-8";

        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASSWORD"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            return null;
        }
    }

    public List<Employs> allWorkers() {
        String query = "SELECT name, position FROM workers";

        List<Employs> workers = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            String name = resultSet.getString("name");
            Position position = Position.valueOf("position");

            Employs employs = new Employs(name);

            workers.add(employs);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return workers;
    }

    public List<Employs> workerName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Who sizes you need? Press " + "a - buttom " + " if you need a list!");
        String bottom = sc.nextLine();
        if (bottom == "all") {
            return allWorkers();
        }else {
            System.out.println("dolgozó neve: ");
             String name = sc.nextLine();

        }
        return null;
    }

}
