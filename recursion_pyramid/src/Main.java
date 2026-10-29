public static String pyramid(String str, int num) {
    if (num != 0 && !Objects.equals(str, "")) {
        return helper(str, num, 0);
    }
    return "please pass in any string and a number (height)";
}

public static String helper(String str, int num, int level) {
    String spaces = " ".repeat(level * str.length());
    return num == 1
            ? spaces + str
            : helper(str, num - 1, level + 1) + '\n' + spaces + str.repeat(2 * num - 1);
}

void main() {
    IO.println(pyramid("❤", 10));
}