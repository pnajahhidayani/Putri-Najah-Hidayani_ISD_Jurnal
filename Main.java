import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<Lagu> listLagu = new LinkedList<Lagu>();
        Scanner input = new Scanner(System.in);

            int choose, i = 0;
            listLagu.add(new Lagu("2002", "Anne Marie"));
            listLagu.add(new Lagu("Secret", "Monsta X"));

            do {
                System.out.println("Menu: " + "\n1. Add Song" + "\n2. Delete Latest Song" + "\n3. Delete" + "\n4. Playlist" + "\n5. Play");

                choose = input.nextInt();

                if (choose == 1) {
                    System.out.println("Add song and singer");
                    String judulLagu = input.next();
                    String penyanyi = input.next();
                    listLagu.add(new Lagu(judulLagu, penyanyi));
                }
                if (choose == 2){
                    System.out.println("Delete Latest Song");
                    int index = listLagu.size() - 1;
                    listLagu.remove(index);
                }
                if (choose == 3) {
                    System.out.println("Delete");
                    String judulLagu = input.next();
                    ListIterator<Lagu> iterator = listLagu.listIterator();
                    while (iterator.hasNext()){
                        Lagu ob = iterator.next();
                        if (ob.getJudulLagu().equals(judulLagu)) {
                            iterator.remove();     
                        }
                    }
                }
                if (choose == 4){
                    ListIterator<Lagu> iterator = listLagu.listIterator();
                    System.out.println("Playlist : ");
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    System.out.println();
                }
            }
            while (choose != 5);

            ListIterator<Lagu> iterator = listLagu.listIterator();
            System.out.println("Play");
            System.out.println("\"");
            while (iterator.hasNext()){
                System.out.println(iterator.next());

            }
            System.out.print("\"");
            System.out.println();
            System.out.print("\"");
            while (iterator.hasPrevious()){
                System.out.println(iterator.previous());
            }
            System.out.print("\"");
    }
}
    