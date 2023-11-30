public class KnightDialer1 {
    private int m = (int) 1e9+7;
    public int knightDialer(int n) {
        // each idx represents next square it can jump to, starting from curr idx
        int[][] jumps = {
                {4, 6},
                {6, 8},
                {7, 9},
                {4, 8},
                {3, 9, 0},
                {},
                {1, 7, 0},
                {2, 6},
                {1, 3},
                {2, 4}
        };

        int[][] dp = new int[n][10]; // at max we have 10 keys

        for (int remain = 0; remain < n; remain++) {
            // ans = (ans + knightDialer_mem(jumps, n - 1, i, dp)) % m;
            for (int square = 0; square < 10; square++) {
                if (remain == 0) {
                    dp[remain][square] = 1;
                    continue;
                }

                int currAns = 0;
                for (int nextSquare : jumps[square]) {
                    currAns = (currAns + dp[remain - 1][nextSquare]) % m;
                }

                dp[remain][square] = currAns;
            }
        }

        int ans = 0;
        for (int square = 0; square < 10; square++) {
            ans = (ans + dp[n-1][square]) % m;
        }

        return ans;
    }
}
