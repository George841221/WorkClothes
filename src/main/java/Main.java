import aplication.DBEngine;
import aplication.DataFromScanner;
import models.Employs;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DBEngine engine = new DBEngine();
        DataFromScanner sc = new DataFromScanner();

     //   System.out.println(engine.isConnected());
        /*if (engine.isConnected()) {
            System.out.println(engine.workerWithSize(engine.onlyWorkerSelect(engine.onlyWorkers())));
        }*/

        if (sc.workerName(engine.allWorkers(), engine.onlyWorkers())){
            while (engine.isConnected()) {
                List<Employs> worker = engine.allWorkers();
                System.out.println(engine.workerWithSize(engine.onlyWorkerSelect(engine.onlyWorkers())));
            }
        }
    }
}
