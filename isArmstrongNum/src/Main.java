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

public boolean isArmstrong(int number) {
    int original = number;
    int sum = 0;
    int digits = String.valueOf(number).length();
    while (number > 0) {
        int digit = number % 10;
        sum += (int) Math.pow(digit, digits);
        number /= 10;
    }
    return sum == original;
}

void main() {
    long start = System.nanoTime();
    IO.println(isArm(93084));
    long end = System.nanoTime();
    IO.println(end - start);
}