import java.awt.*;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ManagerWorker managerWorker;
        managerWorker = new ManagerWorker();
        Worker  worker;
        Scanner sc = new Scanner(System.in);
        int id;
        String Name;
        int age;
        int choice;
        System.out.println("select your choice ");
        choice = sc.nextInt();

        if(choice >= 1 && choice <=3) {
             if (choice == 1 ) {
                 System.out.println("display list");
                 managerWorker.displayAll();
             }
        }

        Random random = new Random();
        System.out.println("Enter your id ");
        id = random.nextInt(100);
        System.out.println("enteer your name");
        sc.nextLine();
        Name = sc.nextLine();
        System.out.println("Enter age");
        age = Integer.parseInt(sc.nextLine());
        worker = new Worker(id , Name , age);
        managerWorker.add(worker);


        managerWorker.sortByAge();
    }
}