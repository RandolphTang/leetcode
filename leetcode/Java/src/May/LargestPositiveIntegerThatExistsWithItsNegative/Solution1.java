package May.LargestPositiveIntegerThatExistsWithItsNegative;

public class Solution1 {
    public int findMaxK(int[] nums) {
        int min = nums[0];
        boolean[] visited = new boolean[1001];
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                visited[-nums[i]] = true;
            }
        }

        for(int num: nums){
            if(num > 0 && visited[num] && num > ans) ans = num;
        }

        return ans == 0? -1 : ans;
    }
}
