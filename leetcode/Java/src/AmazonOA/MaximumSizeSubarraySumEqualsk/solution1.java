package AmazonOA.MaximumSizeSubarraySumEqualsk;

//Given an array nums and a target value k, find the maximum length of a subarray that sums to k. If there isn't one, return 0 instead.

//Example1:
//Input:  nums = [1, -1, 5, -2, 3], k = 3
//Output: 4
//Explanation:
//because the subarray [1, -1, 5, -2] sums to 3 and is the longest.

//Example2:
//Input: nums = [-2, -1, 2, 1], k = 1
//Output: 2
//Explanation:
//because the subarray [-1, 2] sums to 1 and is the longest.

//slide-window method
//
//一个cumulative 的 sum list
//一个current cumulative sum - k 的arr
//
//sum(current) - sum(prev) = k -> sum(current) - k = sum(prev)
//（这个区域类的和值为k，用curr index - prev index that contains the same sum from sum(current) - k)
//
//然后再对比最大数值，得出答案。

public class solution1 {
    public int maxSubArrayLen(int[] nums, int k) {
        // Write your code here

        List<Integer> sum = new ArrayList<>();
        int[] sumK = new int[nums.length + 1];
        sumK[0] = -3;
        sum.add(0);
        int currSum = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            sum.add(currSum);
            sumK[i + 1] = (currSum - k);



            if(sum.contains(sumK[i + 1])){

                max = Math.max(max, (i - sum.indexOf(sumK[i + 1])+ 1));
            }
        }

        return max;
    }
}
