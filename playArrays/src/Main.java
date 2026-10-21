void main() {

    //can only modify existing (set)
    List<Integer> list = Arrays.asList(1,
            2,
            3);
    // immutable - will not allow change anything(set, remove, add)
    List<Integer> list2 = List.of(4,
            5,
            6,
            7);


    // if you need to modify
    List<Integer> list3 = new ArrayList<>(List.of(7,
            8,
            9,
            10));
    list3.addAll(list2);
    IO.println(list);
    IO.println(list2);
    IO.println(list3);


    ArrayList<Integer> list4 = new ArrayList<>(List.of(1,
            2,
            3,
            4,
            5));
    list4.stream().forEach(x -> list4.add(x));
    list4.add(23);
    IO.println(list4);

    // will fail as of different types
    int[] arr = {1, 2, 3};

    List<int[]> list5 = Arrays.asList(arr);

    IO.println(list5.contains(new int[]{1, 2, 3}));
}
