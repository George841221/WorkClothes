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
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return workers;
    }

    public boolean workerName(List<Employs> worker){
        Scanner sc = new Scanner(System.in);
        System.out.print("Who sizes you need? Write " + "(all)" + " in console" + " if you need a list!");
        String  button= sc.nextLine();
        if (button.equals("all")) {
            System.out.println(worker);
        } else {
            if (!button.equals("all")){
                System.out.println("Wrong command! Try again!");
                workerName(worker);
            }
        }
        return false;
    }

}
