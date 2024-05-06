package May.LargestPositiveIntegerThatExistsWithItsNegative;

public class Solution2 {
    public int findMaxK(int[] nums) {
        int[] arr = new int[1001];
        int max = 0;

        for(int num: nums){

            if(num < 0) {
                if(arr[-num] > 0) max = Math.max(max, -num);
                arr[-num]--;
            }else {
                if(arr[num] < 0) max = Math.max(max, num);
                arr[num]++;
            }
        }


        return max == 0 ? -1 : max;
    }
}
