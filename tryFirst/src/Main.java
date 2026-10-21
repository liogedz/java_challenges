public static int solution(String str) {
    str = str.toLowerCase();
    int[] counts = new int[26];
    for (int i = 0; i < str.length(); i++) {
        counts[str.charAt(i) - 'a']++;
    }
    for (int i = 0; i < str.length(); i++) {
        if (counts[str.charAt(i) - 'a'] == 1) {
            return i;
        }
    }
    return -1;
}

void main() {
    IO.println(solution("Mesmerising"));
}