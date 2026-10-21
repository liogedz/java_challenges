import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static AtomicInteger counter = new AtomicInteger(1);

    static void main() {
//        for (int i = 1; i <= 5; i++) {
//            MultiCounter multiCounter = new MultiCounter(i);
//            Thread thread = new Thread(multiCounter);
//            thread.start();
//        }
        for (int i = 1; i <= 5; i++) {
            MultiWait multiWait = new MultiWait(i);
            Thread thread = new Thread(multiWait);
            thread.start();
        }
    }
}
