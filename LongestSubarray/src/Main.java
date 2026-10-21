void main() {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 1, 5, 2, 3, 4));
    IO.println(findLongestSubarray(list));
}

public static int findLongestSubarray(List<Integer> list) {
    int size = list.size();
    if (size == 0) return -1;
    int maxLen = 0;
    int left = 0;

    Map<Integer, Integer> uniques = new HashMap<>();
    for (int right = 0; right < size; right++) {

        int currVal = list.get(right);
        if (uniques.containsKey(currVal)) {
            left = Math.max(left, uniques.get(currVal) + 1);
        }
        uniques.put(currVal, right);
        maxLen = Math.max(maxLen, right - left + 1);
        System.out.println("right " + right + " left " + left + " current " + currVal + " maxLen " + maxLen);
    }
    return maxLen;
}