import aplication.DBEngine;
import models.Employs;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DBEngine engine = new DBEngine();

     //   System.out.println(engine.isConnected());

        if (engine.workerName(engine.allWorkers())){
            while (engine.isConnected()) {
                List<Employs> workers = engine.allWorkers();
                System.out.println(workers);
            }
        }
    }
}
