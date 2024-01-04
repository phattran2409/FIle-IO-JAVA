import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private static final String WORKER_FILE = "Worker.txt";

//    public void write(List<Worker> workerList) throws IOException {
//        FileOutputStream fos = null;
//        ObjectOutputStream os = null;
//
//        fos = new FileOutputStream(new File(WORKER_FILE));
//        os = new ObjectOutputStream(fos);
//        os.writeObject(workerList);
//
//        fos.close();
//        os.close();
//    }
//    public  List<Worker> read() throws IOException, ClassNotFoundException {
//        // đung mảng để lưu trữ
//        List<Worker> workerList = new ArrayList<>();
//        FileInputStream fis = null;
//        ObjectInputStream ois =  null;
//
//         fis = new FileInputStream(new File(WORKER_FILE));
//         ois = new ObjectInputStream(fis);
////
//         workerList = (List<Worker>) ois.readObject();
//         fis.close();
//         ois.close();
//
//        return  workerList;
//    }

    public void write(List<Worker> workerList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(WORKER_FILE));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(workerList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    /**
     * read list student from file
     *
     * @return list student
     */
    public List<Worker> read() {
        List<Worker> workerList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(WORKER_FILE));
            ois = new ObjectInputStream(fis);
            workerList = (List<Worker>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return workerList;
    }

    /**
     * close input stream
     *
     * @param is: input stream
     */
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * close output stream
     *
     * @param os: output stream
     */
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
