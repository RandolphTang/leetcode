package AmazonOA.MaximumSizeSubarraySumEqualsk;

public class second {

    /**
     * @param nums: an array
     * @param k: a target value
     * @return: the maximum length of a subarray that sums to k
     */

    //reduce the use of extra space stored for cumulative sum - K (which is previous possible sum in pre location)  and also the indice of it
    //Map used to record the currSum (cumulative sum)
    //intialize it with 0 and -1 (currSum now is 0 and at location -1)
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> record = new HashMap<>();
        int res = 0;
        int currSum = 0;

        record.put(0, -1);

        for(int i = 0; i < nums.length; i++){

            currSum += nums[i];

            if(record.containsKey(currSum - k)){
                res = Math.max(res, i - record.get(currSum - k));
            }

            if(!record.containsKey(currSum)){
                record.put(currSum, i);
            }
        }

        return res;
    }
}
