import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,
                2,
                2,
                1,
                5,
                1,
                7,
                2,
                3,
                4);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
