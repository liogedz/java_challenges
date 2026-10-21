import java.util.Map;

public class Main {
    public static void main(String[] args) {

        var mapAdd = Map.of(1,
                "a",
                2,
                "b",
                3,
                "c");
        var map = Map.entry(1,
                1);
        var map2 = Map.entry(4,
                4);
        var mapAll = Map.ofEntries(map,
                map2);

        System.out.println(mapAdd + " " + mapAll);
    }
}
