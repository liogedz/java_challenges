public static String pyramid(String str, int num) {
    if (num > 0 && !str.isEmpty()) {
        return helper(str, num, 1);
    }
    return "please pass in any string and a number (height)";
}

public static String helper(String str, int num, int level) {
    String lines = " ".repeat(num * str.length()) + str.repeat(level * 2 - 1);
    return num == 1
            ? lines
            : lines + '\n' + helper(str, num - 1, level + 1);
}

void main() {
    IO.println(pyramid("❤", 10));
}