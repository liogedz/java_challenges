void main() {
    int[] nums = {2, 4, 6, 8, 10};
    int[] prefixSum = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
        prefixSum[i + 1] = prefixSum[i] + nums[i];
    }
    System.out.println(Arrays.toString(prefixSum));
    int left = 1;
    int right = 3;
    int answer = prefixSum[right + 1] - prefixSum[left];
    System.out.println(answer);
}