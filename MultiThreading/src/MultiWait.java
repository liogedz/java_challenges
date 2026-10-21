public class MultiWait implements Runnable {
    private int threadID;
    private static int turn = 1;

    public MultiWait(int threadID) {
        this.threadID = threadID;
    }

    @Override
    public void run() {
        synchronized (MultiWait.class) {
            while (threadID != turn) {
                try {
                    MultiWait.class.wait();
                } catch (InterruptedException _) {
                }
            }

            System.out.println(turn + " is running thread # " + threadID);

            turn++;
            MultiWait.class.notifyAll();
        }
    }
}