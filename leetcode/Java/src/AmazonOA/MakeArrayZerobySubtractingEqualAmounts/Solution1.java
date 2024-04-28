package AmazonOA.MakeArrayZerobySubtractingEqualAmounts;

public class Solution1 {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int op = 0;

        if(nums[0] != 0) op++;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) continue;
            if(i != 0  && nums[i] != nums[i - 1]) op++;
        }

        return max == 0? 0 : op;
    }
}
