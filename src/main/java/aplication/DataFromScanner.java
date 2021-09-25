package aplication;

import models.Employs;

import java.util.List;
import java.util.Scanner;

public class DataFromScanner {

    DBEngine engine = new DBEngine();
    Employs emp = new Employs();

    public boolean workerName(List<Employs> workers, List<Employs> enyWorker){
        Scanner sc = new Scanner(System.in);
        System.out.print("Who sizes you need? Write " + "(all)" + " in console" + " if you need the employee list!");
        String  button= sc.nextLine();

        if (button.equals("all")) {
            System.out.println(workers);
        } else if (button.equals(engine.onlyWorkerSelect(engine.onlyWorkers()))){
            for (Employs any : enyWorker
                 ) { any.equals(engine.workerWithSize(engine.onlyWorkerSelect(engine.onlyWorkers())));

            }
        }

        else {
            System.out.println("Wrong command! Try again!");
            workerName(engine.allWorkers(), engine.onlyWorkers());
        }
        return false;
    }
}
