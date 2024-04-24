import java.util.ArrayList;
import java.util.Iterator;

public class OmaIteraattori {

    public static void main(String[] args) {
        // kaksi säiettä käy läpi kokoelmaa omilla iteraattoreillaan

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it1 = list.iterator();
        Iterator<Integer> it2 = list.iterator();

        Thread t1 = new Thread(() -> {
            while (it1.hasNext()) {
                System.out.println("Thread 1: " + it1.next());

            }
        });

        Thread t2 = new Thread(() -> {
            while (it2.hasNext()) {
                System.out.println("Thread 2: " + it2.next());

                // muutoksia läpikäynnin aikana
                list.add(4);

            }
        });

        t1.start();
        t2.start();

    }
}
