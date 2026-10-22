public static boolean solution(String number) {
    int sum = 0;
    int[] nums = new int[16];
    number = number.replace(" ", "");
    for (int i = 0; i < number.length(); i++) {
        nums[i] = number.charAt(i) - '0';
    }
    for (int i = number.length() - 1; i >= 0; i--) {
        if (i % 2 == 0) {
            nums[i] *= 2;
        }
        if (nums[i] > 9) {
            nums[i] -= 9;
        }
        sum += nums[i];
    }
    return sum % 10 == 0;
}

void main() {
    IO.println(solution("5470 2500 0524 0073"));
}