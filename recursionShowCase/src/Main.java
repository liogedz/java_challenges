public static String solution(String str, int num) {
    if (num != 0 && !Objects.equals(str, "")) {
        return num == 1 ? str : solution(str, num - 1) + '\n' + str.repeat(num);
    }
    return "please pass in any string and a number (height)";
}

void main() {
    IO.println(solution("❤", 10));
}