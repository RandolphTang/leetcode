package AmazonOA.MinimumAdjacentSwapstoMakeaValidArray;

public class Solution1 {
    public int minimumSwaps(int[] nums) {
        int maxElement = nums[0];
        int minElement = nums[0];
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 1; i < nums.length; i++){

            if(nums[i] >= maxElement) {
                maxElement = nums[i];
                maxIndex = i;
            }

            if(nums[i] < minElement) {
                minElement = nums[i];
                minIndex = i;
            }

        }

        if (minElement == maxElement){
            return 0;
        }

        if(maxIndex < minIndex){
            return nums.length - 1 - maxIndex + minIndex - 1;
        }
        return nums.length - 1 - maxIndex + minIndex;
    }
}
