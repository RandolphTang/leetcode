package May.MaximumSubarray;

public class Solution1 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];

        for(int num: nums){
            sum += num;
            max = max < sum? sum : max;
            sum = sum < 0? 0 : sum;
        }

        return max;
    }]
}
