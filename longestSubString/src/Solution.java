import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int size = s.length();
        if (size == 0) return 0;
        int left = 0;
        int maxLen = 0;
        Map<Character, Integer> charSet = new HashMap<>();
        for (int righ = 0; righ < size; righ++) {
            char ch = s.charAt(righ);
            if (charSet.containsKey(ch)) {
                left = Math.max(left,
                        charSet.get(ch) + 1); //moves to the psn of saved char, when it repeats
            }
            charSet.put(ch,
                    righ);
            maxLen = Math.max(maxLen,
                    righ - left + 1);
            System.out.println("char " + ch + " right " + righ + " left " + left + " maxLen " + maxLen);
        }
        return maxLen;
    }
}
