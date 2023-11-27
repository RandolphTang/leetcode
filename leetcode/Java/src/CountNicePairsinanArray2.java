public class CountNicePairsinanArray2 {
    public int rev(int num){
        int ans = 0;
        while(num > 0) {

            ans = ans * 10 + (num % 10);
            num /= 10;

        }

        return ans;
    }

    public int countNicePairs(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            nums[i] -= rev(nums[i]);
        }

        Arrays.sort(nums);
        var curr = nums[0];
        long ans = 0;
        var count = 0;

        for(int i = 1; i < nums.length; i++) {
            if(curr == nums[i]){
                count++;
            } else {
                ans += helper(count);
                curr = nums[i];
                count = 0;
            }
        }

        ans += helper(count);
        return (int)(ans%1000000007) ;

    }

    public long helper(int count) {
        return ((long)count + 1) * (long)(count) / 2;
    }
}
