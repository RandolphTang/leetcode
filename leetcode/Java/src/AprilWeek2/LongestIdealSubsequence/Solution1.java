package AprilWeek2.LongestIdealSubsequence;

public class Solution1 {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];

        for(char eachC: s.toCharArray()){
            final int curr = eachC - 'a';
            dp[curr] = 1 + helper(dp, curr, k);
        }

        return Arrays.stream(dp).max().getAsInt();
    }

    private int helper(int[] dp, int curr, int k){
        int start = Math.max(0, curr - k);
        int end =  Math.min(curr + k, 25);
        int maxReachable = 0;
        for(int i = start; i <= end; i++){
            maxReachable = Math.max(dp[i], maxReachable);
        }
        return maxReachable;
    }
}
