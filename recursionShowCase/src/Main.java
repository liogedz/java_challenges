public static String solution(String str, int num) {
    if (num != 0 && !Objects.equals(str, "")) {
        if (num == 1) return str;
        return solution(str, num - 1) + '\n' + str.repeat(num);
    }
    return "please pass in a string and number";
}

void main() {
    IO.println(solution("*", 10));
}