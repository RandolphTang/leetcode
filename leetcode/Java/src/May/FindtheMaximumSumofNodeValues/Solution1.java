package May.FindtheMaximumSumofNodeValues;

public class Solution1 {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int count = 0;
        int sum = 0;
        int minLoss = Integer.MAX_VALUE;

        for(int num: nums){
            if((num ^ k) > num){
                count++;
                sum += num ^ k;
            } else {
                sum += num;
            }

            minLoss = Math.min(minLoss, Math.abs(num - num ^ k));
        }


        if(count % 2 == 0){
            return sum;
        }

        return sum - minLoss;
    }
}
