package May.LongestIncreasingSubsequence;

public class Solution1 {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);

        for(int i = 1; i < nums.length; i++){

            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    arr[i] = Math.max(arr[i], arr[j] + 1);
                }
            }
        }

        return Arrays.stream(arr).max().getAsInt();
    }
}
