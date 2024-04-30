package April.MinimumNumberofOperationstoMakeArrayXOREqualtoK;

public class Solution1 {
    public int minOperations(int[] nums, int k) {
        final int xors = Arrays.stream(nums).reduce((a, b) -> a ^ b).getAsInt();
        return Integer.bitCount(k ^ xors);
    }
}
