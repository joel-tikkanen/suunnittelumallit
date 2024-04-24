import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveIteraattori {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();

        Thread t1 = new Thread(() -> {
            while (it.hasNext()) {
                Integer value = it.next();
                if (value % 2 == 0) { 
                    it.remove();
                    System.out.println("Thread 1 removed: " + value);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (it.hasNext()) {
                Integer value = it.next();
                if (value % 2 != 0) { 
                    it.remove();
                    System.out.println("Thread 2 removed: " + value);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
