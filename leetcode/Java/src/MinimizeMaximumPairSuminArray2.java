public class MinimizeMaximumPairSuminArray2 {
    // the great sliding window method, think it cost less time complexity
    // and Arrays.sort method's time complexity is o(nlogn)

    public int minPairSum(int[] nums) {
        int minCurr = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            minCurr = Math.max(minCurr, nums[i]);
        }

        int[] window = new int[minCurr + 1];

        for(int i = 0; i < nums.length; i++) {
            int windowIndex = nums[i];
            window[windowIndex]++;
        }

        int start = 1, end = minCurr, sum = 0;

        while(start <= end){

            while(window[start] == 0) start++;
            while(window[end] == 0) end--;

            sum = (start + end) > sum? (start + end) : sum;

            if(window[start] > window[end]) {
                window[start] -= window[end];
                --end;
            }

            else if(window[end] > window[start]) {
                window[end] -= window[start];
                ++start;
            }

            else {
                start++;
                end--;
            }

        }

        return sum;
    }

}
