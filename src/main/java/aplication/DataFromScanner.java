package aplication;

import models.Employs;

import java.util.List;
import java.util.Scanner;

public class DataFromScanner {

    DBEngine engine = new DBEngine();

    public boolean workerName(List<Employs> workers){
        Scanner sc = new Scanner(System.in);
        System.out.print("Who sizes you need? Write " + "(all)" + " in console" + " if you need the employee list!");
        String  button= sc.nextLine();

        if (button.equals("all")) {
            System.out.println(workers);
        } else {
            System.out.println("Wrong command! Try again!");
            workerName(engine.allWorkers());
        }
        return false;
    }
}
