package unorganized;

public class MinimizeMaximumPairSuminArray1 {
    public int minPairSum(int[] nums) {

        Arrays.sort(nums);
        int minMax = 0;

        for(int i  = 0; i < nums.length / 2; i++) {
            minMax = Math.max(minMax,
                    nums[i] + nums[nums.length - i - 1]);
        }

        return minMax;
    }
}
