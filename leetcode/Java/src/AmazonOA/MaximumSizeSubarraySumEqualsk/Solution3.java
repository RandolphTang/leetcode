package AmazonOA.MaximumSizeSubarraySumEqualsk;

public class Solution3 {
    public int maxSubArrayLen(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int max = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        //index
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == k){
                max = i + 1;
            }
            if(map.containsKey(sum - k)){
                max = Math.max(max, i - map.get(sum - k));
            }
            map.putIfAbsent(sum, i);

        }
        return max;
    }
}
