package unorganized;

public class FrequencyoftheMostFrequentElement {
    public int maxFrequency(int[] nums, int k) {
        int len = nums.length;
        long sum = 0;
        int ans = 0;

        Arrays.sort(nums);

        for(int j = 0, i = 0; i < len; i++) {
            sum += nums[i];
            while(sum + k < (long)nums[i] * (i - j + 1))
                sum -= nums[j++];
            ans = Math.max(ans, i - j + 1);
        }

        return ans;
    }
}
