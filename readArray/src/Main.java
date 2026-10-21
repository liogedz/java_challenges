import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {

//        try (var lines = Files.lines(Path.of("data/hist.txt"))) {
//            var count = lines
//                    .flatMap(line -> Arrays.stream(line.split(",")))
//                    .map(Integer::parseInt)
//                    .collect(Collectors.toMap(n -> n,
//                            n -> 1,
//                            Integer::sum));
//            System.out.println(count);
//        }

        Map<Integer, Integer> count = new HashMap<>();

        try (BufferedReader br = Files.newBufferedReader(Path.of("data/hist.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    int number = Integer.parseInt(part);
                    count.merge(number, 1, Integer::sum);
                }
            }
        }
        System.out.println(count);
    }
}
