package AmazonOA.MakeArrayZerobySubtractingEqualAmounts;

public class Solution2 {
    public int minimumOperations(int[] nums) {

        int[] unique = new int[101];
        int op = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) continue;
            unique[nums[i]]++;
        }

        for(int i = 0; i < unique.length; i++){
            if(unique[i] > 0) op++;
        }

        return  op;
    }
}
