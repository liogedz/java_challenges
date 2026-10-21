//public static boolean isArm(int num) {
//    return num == getSum(num, getLen(num));
//}

public static int getLen(int num) {
    return num == 0 ? 0 : 1 + getLen(num / 10);
}

public static int getSum(int num, int power) {
    return num == 0 ? 0 : (int) Math.pow(num % 10, power) + getSum(num / 10, power);
}

public static boolean isArm(int num) {
    int saved = num;
    int sum = 0;
    int power = String.valueOf(num).length();
    while (num > 0) {
        sum += (int) Math.pow(num % 10, power);
        num /= 10;
    }
    return sum == saved;
}

void main() {
    IO.println(isArm(93084));
}