package unorganized;

public class MedianofTwoSortedArr1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //This question requires us to find median of two list combined in sorted order

        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];

        int i = 0, j = 0;
        int k = 0;

        while (i < m && j < n) { //make sure no outofbound error
            if(num1[i] < num2[j]) nums[k++] = num1[i++];
            else nums[k++] = num2[j++];
        } // fill in all numbers in order into new list
            // but since length of each list may not match, might be leftover

        for(; i < m; i++) nums[k++] = num1[i++];
        for(; j < m; j++) nums[k++] = num2[j++];

        //fill in all leftover nums

        if ((m+n)%2 == 0) { // check how many values in the nums
                            // so that decide take middle value or middle two values
            return ((float)nums[(m + n - 1) / 2] + (float)nums[(m + n) / 2]) / (float)2;
        } else return (float)nums[(m + n - 1) / 2];
    }
}
