package unorganized;

public class SumofAbsoluteDifferencesinaSortedArray2 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum = 0;

        for(int i  = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int right = sum;
        int left = 0;
        int[] ans = new int[nums.length];

        for(int i  = 0; i < nums.length; i++) {
            int num = nums[i];
            right -= num;

            ans[i] = num * i - left + right - num * (nums.length - i - 1);

            left += num;
        }
        return ans;
    }
}
