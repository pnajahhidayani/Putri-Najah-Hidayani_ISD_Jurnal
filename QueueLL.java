import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


//bikin class sama methodnya dulu
public class QueueLL<E> {
    private Queue<E> todo;
    public QueueLL(){
        todo = new LinkedList<>();
    }
    //buat nambahin object
    public void enqueue (E object) {
        todo.add(object);
    }
    //hapus object
    public E dequeue() throws NoSuchElementException {
        return todo.remove();
    }
    //sesudah dihapus
    public boolean isEmpty() {
        return todo.isEmpty();
    } 
    //print todo yang ada
    public void printQueue() {
        Iterator<E> iterator = todo.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value + " ");
        }
    }
}



