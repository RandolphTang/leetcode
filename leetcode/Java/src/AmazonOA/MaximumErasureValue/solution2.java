package AmazonOA.MaximumErasureValue;

public class solution2 {
    public int maximumUniqueSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sumScore = 0, maxScore = Integer.MIN_VALUE;
        int[] numCnt = new int[10001];
        for (int start = 0, end = 0; end < nums.length; end++) {
            numCnt[nums[end]]++;
            sumScore += nums[end];

            while(numCnt[nums[end]] > 1) {
                numCnt[nums[start]]--;
                sumScore -= nums[start];
                start++;
            }

            maxScore = Math.max(maxScore, sumScore);
        }
        return maxScore;
    }
}
