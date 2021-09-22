import aplication.DBEngine;
import aplication.DataFromScanner;
import models.Employs;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DBEngine engine = new DBEngine();
        DataFromScanner sc = new DataFromScanner();

     //   System.out.println(engine.isConnected());

        if (sc.workerName(engine.allWorkers())){
            while (engine.isConnected()) {
                List<Employs> worker = engine.allWorkers();
                System.out.println(worker);
            }
        }
    }
}
