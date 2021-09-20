package aplication;

import models.Employs;
import models.Position;

import java.sql.*;
import java.util.*;

public class DBEngine {

    private final Connection connection;

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
        properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASSWORD"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            return null;
        }
    }

    public List<Employs> onlyWorkers() {
        String query = "SELECT worker_name FROM workers";
        List<Employs> workerList = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("worker_name");

                Employs employs = new Employs(name);

                workerList.add(employs);

            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return workerList;
    }

    public List<Employs> allWorkers() {
        String query = "SELECT worker_name, position FROM workers";

        List<Employs> workers = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String name = resultSet.getString("worker_name");
            String positionFromDB = resultSet.getString("position").toUpperCase();
            Position position = Position.valueOf(positionFromDB);

            Employs employs = new Employs(name, position);

            workers.add(employs);
        }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return workers;
    }

    public List<Employs> workerWithSize(String sourceName) {
        String query = "SELECT * FROM workers WHERE worker_name = " + sourceName;
        List<Employs> employee = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("worker_name");
                String positionFromDB = resultSet.getString("position").toUpperCase();
                Position position = Position.valueOf(positionFromDB);
                String t_ShirtSize = resultSet.getString("t_shirt_size");
                String sweaterSize = resultSet.getString("sweater_size");
                String vestSize = resultSet.getString("vest_size");
                String jacketSize = resultSet.getString("jacket_size");
                int trousersSize = resultSet.getInt("trousers_size");
                int shortsSize = resultSet.getInt("shorts_size");
                int safetyBootsSize = resultSet.getInt("safety_boots_size");

                Employs employs = new Employs(name, position, t_ShirtSize, sweaterSize, vestSize,
                        jacketSize, trousersSize, shortsSize, safetyBootsSize);

                employee.add(employs);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return employee;
    }

    public boolean workerName(List<Employs> worker){
        Scanner sc = new Scanner(System.in);
        System.out.print("Who sizes you need? Write " + "(all)" + " in console" + " if you need the employee list!");
        String  button= sc.nextLine();
        if (button.equals("all")) {
            System.out.println(worker);
        }
        else {
            System.out.println("Wrong command! Try again!");
            workerName(allWorkers());
            }
        return false;
    }
}



