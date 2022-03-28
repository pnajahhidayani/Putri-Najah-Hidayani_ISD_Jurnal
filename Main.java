import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        QueueLL<String> queue = new QueueLL<>();

        Scanner in = new Scanner(System.in);
        int opsi = 0;

        while (opsi != 4) {
            //klo opsi yg dipilih 1-4, print ini
            System.out.println("1. Masukan data");
            System.out.println("2. Hapus data");
            System.out.println("3. Print data");
            System.out.println("4. Done");
            opsi = in.nextInt();

            if (opsi == 1) {
                System.out.println("Masukan TO DO");
                String toDo = in.next();
                //buat masukin data pake enqueue yg first in first out
                queue.enqueue(toDo);
                System.out.println();
            }
            else if (opsi == 2) {
                //hapus todo yg pertama kali ditambah
                queue.dequeue();
                System.out.println("Todo telah dihapus");
                System.out.println();
            }
            else if (opsi == 3) {
                //print data yang udh dihapus atau data yg ada
                queue.printQueue();
                System.out.println();
            }
        }
        
    }
    
}
