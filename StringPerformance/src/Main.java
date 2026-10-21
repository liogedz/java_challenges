public class Main {
    public static void main(String[] args) {
        int iterations = 100_000;

        long startTime = System.currentTimeMillis();
        String resultString = "";
        for (int i = 0; i < iterations; i++) {
            resultString += "a";
        }
        long endTimeString = System.currentTimeMillis();
        long totalTime = endTimeString - startTime;
        System.out.println("String concat time: " + totalTime + " ms");

        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.repeat("a",
                iterations);
        long endTimeBuilder = System.currentTimeMillis();
        long totalTimeBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("StringBuilder concat time: " + totalTimeBuilder + " ms");

        long startTimeBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.repeat("a",
                iterations);
        long endTimeBuffer = System.currentTimeMillis();
        long totalTimeBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("StringBuffer concat time: " + totalTimeBuffer + " ms");
    }
}
