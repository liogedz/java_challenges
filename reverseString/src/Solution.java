public class Solution {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int right = arr.length - 1;
        int left = 0;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }
}
