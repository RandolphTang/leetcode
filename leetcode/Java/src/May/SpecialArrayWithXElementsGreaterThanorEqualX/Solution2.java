package May.SpecialArrayWithXElementsGreaterThanorEqualX;

public class Solution2 {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        int ans = 0;

        for(int num: nums){
            if(num > n) count[n]++;
            else count[num]++;
        }

        for(int i = n; i >= 0; i--){
            ans += count[i];
            if(ans == i) return ans;
        }

        return -1;
    }
}
