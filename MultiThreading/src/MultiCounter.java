public class MultiCounter implements Runnable {
    private int threadID;

    public MultiCounter(int threadID) {
        this.threadID = threadID;
    }

    @Override
    public void run() {
        int value = Main.counter.getAndIncrement();
        System.out.println(value + " from thread " + threadID);
    }
}

