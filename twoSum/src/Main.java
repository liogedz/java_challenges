public static int[] Solution(int[] nums, int target) {
    int[] notFound = new int[]{-1, -1};
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int current = nums[i];
        int compliment = target - current;
        if (map.containsKey(compliment)) {
            return new int[]{map.get(compliment), i};
        }
        map.put(current, i);
    }
    return notFound;
}

void main() {
    IO.println(Arrays.toString(Solution(new int[]{2, 4, 6, 7, 8, 9}, 16)));
}