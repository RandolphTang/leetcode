package unorganized;

public class MaximumElementAfterDecreasingandRearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int length = arr.length;
        int[] count = new int[length];

        for(int i = 0; i < length; i++) {
            ++count[Math.min(arr[i] - 1, length - 1)];
        }

        int ans = 1;
        for(int i = 1; i < length; i++) {
            ans = Math.min(i + 1, ans + count[i]);
        }

        return ans;
    }
}
