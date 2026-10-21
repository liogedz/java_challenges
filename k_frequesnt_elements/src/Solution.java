import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Solution {
    public static int[] topKFrequent(int[] nums,
                                     int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,
                    map.getOrDefault(num,
                            0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        int[] res = new int[k];
        int idx = 0;
        for (int freq = buckets.length - 1; freq >= 0 && idx < k; freq--) {
            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    res[idx++] = num;
                    if (idx == k) {
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
