package AmazonOA.MaximumErasureValue;
//slower in time complexity

public class solution1 {
    public int maximumUniqueSubarray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        Set<Integer> s = new HashSet<>();
        int maxSum = 0;
        int currSum = 0;
        int left = 0;

        for(int i = 0; i < nums.length; i++) {

            while(s.contains(nums[i])){

                int remove = nums[left];
                s.remove(remove);
                currSum = currSum - remove;
                left++;
            }

            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            s.add(nums[i]);
        }

        return maxSum;

    }
}
