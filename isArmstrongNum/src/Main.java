public static boolean isArm(int num) {
    return num == getSum(num, getLen(num));
}

public static int getLen(int num) {
    return num == 0 ? 0 : 1 + getLen(num / 10);
}

public static int getSum(int num, int power) {
    return num == 0 ? 0 : getPow(num % 10, power) + getSum(num / 10, power);
}

public static int getPow(int num, int power) {
    if (power == 0) return 1;
    int halfPower = getPow(num, power / 2);
    return power % 2 == 1 ? num * halfPower * halfPower : halfPower * halfPower;
}

//public static boolean isArm(int num) {
//    int saved = num;
//    int sum = 0;
//    int power = String.valueOf(num).length();
//    while (num > 0) {
//        sum += (int) Math.pow(num % 10, power);
//        num /= 10;
//    }
//    return sum == saved;
//}

void main() {
    IO.println(isArm(93084));
//    IO.println(getPow(2, 3));
}