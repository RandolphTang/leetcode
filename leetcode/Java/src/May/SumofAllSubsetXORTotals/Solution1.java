package May.SumofAllSubsetXORTotals;

public class Solution1 {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int XOR){
        if(index == nums.length) return XOR;

        int x = dfs(nums, index + 1, XOR);
        int y = dfs(nums, index + 1, nums[index] ^ XOR);

        return x + y;
    }
}
