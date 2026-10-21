public static String solution(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        result.insert(0, str.charAt(i));
    }
    return result.toString();
}

void main() {
    IO.println(solution("alex"));
}