package AprilWeek2.NthTribonacciNumber;

public class Solution1 {
    public int tribonacci(int n) {

        if(n < 1){
            return 0;
        }

        int next = 0;
        int[] dp = new int[]{0, 1, 1};

        for(int i = 3; i <= n; i++){
            next = dp[0] + dp[1] + dp[2];
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = next;
        }

        return dp[2];
    }
}
