void main() {
    int num = 987654321;
//    int sum = 0;
//    while (num > 0) {
//        sum = sum + num % 10;
//        num = num / 10;
//        System.out.println(sum + " " + num);
//    }
    String s1 = "Java";
    String s2 = new String("Java");
    s2.intern();
    System.out.println(s1 == s2);
    System.out.println(s1 == s2.intern());

    s2 = s2.concat(" Backend");
    System.out.println(s2);
//    int sum = String.valueOf(num)
//            .chars()
//            .map(Character::getNumericValue)
//            .sum();


//    IO.println(sum);
    IO.println(sumDigits(num));
}

public static long sumDigits(long num) {

    if (num == 0) {
        return 0;
    }
    return num % 10 + sumDigits(num / 10);

//    return num == 0 ? 0 : num % 10 + sumDigits(num / 10);
}