public static int solution(String str) {
    int[] count = new int[26];
    for (int i = 0; i < str.length(); i++) {
        count[str.charAt(i) - 'a']++;
    }
    for (int i = 0; i < str.length(); i++) {
        if (count[str.charAt(i) - 'a'] == 1) {
            return i;
        }
    }
    return -1;
}

void main() {
    IO.println(solution("leetcode"));
}