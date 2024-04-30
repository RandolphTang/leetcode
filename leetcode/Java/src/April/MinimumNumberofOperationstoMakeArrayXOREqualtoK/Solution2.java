package April.MinimumNumberofOperationstoMakeArrayXOREqualtoK;

public class Solution2 {
    public int minOperations(int[] nums, int k) {
        int xor = k;
        for (int num : nums) {
            xor = xor ^ num;
        }
        int count = 0;
        while (xor > 0) {
            count += (xor % 2);
            xor /= 2;
        }
        return count;
    }
}
