// find if subarray of 'k' distinct elements exists, if yes return its shortest length or -1
public static int findMinimumLengthSubarray(List<Integer> arr,
                                            int k) {
    int n = arr.size();
    if (n == 0 || k == 0) return -1;

    Map<Integer, Integer> freq = new HashMap<>();
    int left = 0;
    int minLen = Integer.MAX_VALUE;

    for (int right = 0; right < n; right++) {
        // if possible, creating map with 'k' distinct keys, value(s) ++
        freq.merge(arr.get(right), 1, Integer::sum);
        IO.println(freq);

        while (freq.size() >= k) {
            // if reach out here, array exists, the map has 'k' elements
            // moving left array margin to right with each while-loop iteration
            int len = right - left + 1;
            if (len < minLen) {
                minLen = len;
                IO.println("Best subarray: " + arr.subList(left, right + 1));
            }
            // reducing count of removed array element in the Map
            int leftVal = arr.get(left);
            freq.merge(leftVal, -1, Integer::sum);
            // if no more element counts - remove it from the Map - > required minimum length found
            if (freq.get(leftVal) == 0) {
                freq.remove(leftVal);
            }
            left++;
            IO.println("left: " + left + " " + "right: " + right);
        }
    }
    return minLen == Integer.MAX_VALUE ? -1 : minLen;
}

void main() {
    List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3));
    int result = findMinimumLengthSubarray(arr, 3);
    IO.println("Result " + result);
}

