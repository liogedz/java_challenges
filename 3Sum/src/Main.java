private static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    int len = nums.length;

    for (int i = 0; i < len && nums[i] <= 0; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        int current = nums[i];
        int left = i + 1;
        int right = len - 1;

        while (left < right) {

            int leftVal = nums[left];
            int rightVal = nums[right];
            int sum = current + leftVal + rightVal;

            if (sum == 0 && (left == i + 1 || nums[left] != nums[left - 1])) {
                res.add(Arrays.asList(current, leftVal, rightVal));
                if (current == 0) break;
                right--;
                left++;
                continue;
            }
            if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }
    }
    return res;
}

void main() {
    System.out.println(threeSum(new int[]{2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4, 5, 5, -10}));
}