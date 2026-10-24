public static String solution(String str, int num) {
    return num == 1 ? str : solution(str, num - 1) + '\n' + str.repeat(num);
}

void main() {
    IO.println(solution("*", 10));
}