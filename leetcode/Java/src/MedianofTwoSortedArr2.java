public class MedianofTwoSortedArr2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // This is a classic merge method (divide and conquer
        // compared to 1, this method has smaller time complexity
        // because the first version is quadratic time complexity, while this one
        // only has o(log)

        int m = nums1.length;
        int n = nums2.length;

        //find each arr's length

        if(m > n) return findMedianSortedArrays(nums2, nums1);

        int total = m + n;
        int half = (total + 1) / 2;

        // class divide and conquer format, search from both arr

        int left = 0;
        int right = m;

        // find the partition location

        var result = 0.0;

        while ( left <= right ) {

            // based on initial partition point, we need four partition points
            // to identify if the value in arr1 is larger than arr2 or not, and
            // how the boundary of each arr can form the median calculation

            int i = left + (right - left) / 2; // for shorter arr or normal arr 1, the starting searching location
            int j = half - i; // j is used to identify the location of arr 2 based on i
            // so i and j decide if the searching location in both arr moves right or left if first condition no pass

            // with i and j, we can continue to find the partition points (4) on each right and left side

            int left1 = (i > 0)? nums1[i - 1] : Integer.MIN_VALUE;
            int right1 = (i < m)? nums1[i] : Integer.MAX_VALUE;
            int left2 = (j > 0)? nums2[j - 1] : Integer.MIN_VALUE;
            int right2 = (j < n)? nums2[j] : Integer.MAX_VALUE;

            // max and min prevents the situation of left < right never happen
            // cause when left bound move to a certain location, the value auto turning into min_value

            // after finding the four boundary points, we need to see
            // if they are the right partition to find median

            if (left1 <= right1 && left2 <= right2) { // so
                if (total % 2 == 0) {
                    result = (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0 ;

                    // since the connection between two arrs is always right -> left, so left should be max and right min
                } else {
                    result = Math.max(left1, left2);
                }

                break;
            }  else if (left1 > right2) { // both arrs are in values of inverse-order such as 3, 4  and  1,2
                                            // then move right boundary to left (move to left that is)
                right = i - 1;
            } else { // continue searching prevent situation of 1, 5 and 3, 4
                left = i + 1;
            }
        }
        return result;
    }
}
