public static int Solution(int[] nums, int target) {
    int result = 0;
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int midVal = nums[mid];
        if (midVal == target) {
            result = mid;
            right = mid - 1;
        } else if (midVal < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return result;
}

void main() {
    IO.println(Solution(new int[]{2, 4, 6, 7, 9, 11, 34}, 34));
}