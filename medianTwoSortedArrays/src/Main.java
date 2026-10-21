void main() {

    int[] arr1 = {4};
    int[] arr2 = {2, 2, 2, 4, 4};
    IO.println(findMedianSortedArrays(arr1,
            arr2));
}

public static double findMedianSortedArrays(int[] nums1,
                                            int[] nums2) {
    if (nums1.length > nums2.length) {
        return findMedianSortedArrays(nums2,
                nums1);
    }
    int lenA = nums1.length;
    int lenB = nums2.length;
    int low = 0;
    int high = lenA;
    while (low <= high) {
        int partA = (low + high) / 2;
        int partB = (lenA + lenB + 1) / 2 - partA;


        int maxLeftA = partA == 0 ? Integer.MIN_VALUE : nums1[partA - 1]; // no elements to left min infinity
        int minRightA = partA == lenA ? Integer.MAX_VALUE : nums1[partA]; // no elements to right max infinity

        int maxLeftB = partB == 0 ? Integer.MIN_VALUE : nums2[partB - 1];
        int minRightB = partB == lenB ? Integer.MAX_VALUE : nums2[partB];

        if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
            if ((lenA + lenB) % 2 == 0) {
                return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
            }
            return Math.max(maxLeftA, maxLeftB);

        } else if (maxLeftA > minRightB) {
            high = partA - 1;
        } else {
            low = partA + 1;
        }
    }
    return -1;
}
