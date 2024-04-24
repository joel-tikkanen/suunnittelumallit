import java.util.ArrayList;
import java.util.Iterator;

public class SamaIteraattori {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();

        Thread t1 = new Thread(() -> {

            while (it.hasNext()) {
                System.out.println("Thread 1: " + it.next());
            }

        });

        Thread t2 = new Thread(() -> {

            while (it.hasNext()) {
                System.out.println("Thread 2: " + it.next());
            }
        });

        t1.start();
        t2.start();

    }
}
