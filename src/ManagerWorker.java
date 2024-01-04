import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ManagerWorker {
    List<Worker> workerList;
    ReadAndWriteFile readAndWriteFile;

    public ManagerWorker()  {
        readAndWriteFile = new ReadAndWriteFile();
        workerList = readAndWriteFile.read();
    }

    public void add(Worker worker)  {
        workerList.add(worker);
        readAndWriteFile.write(workerList);
    }
    public void  displayAll()  {
        for (Worker worker : workerList) {
            System.out.println(worker.toString());
        }
    }

    public void sortByAge() {
        Collections.sort(workerList, new sortByAge());
        for (Worker worker : workerList) {
            System.out.println(worker.toString());
        }

    }



}
