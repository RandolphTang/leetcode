package AmazonOA.EditDistance;

public class Solution1 {

    //use dp to break down questions, compare each sub part of each word (in char array) to the rest of it, and calculate
    // the min operation for each sub part, then the final dp[w1.length][w2.length] would be the cumulated min operation needed

    public int minDistance(String word1, String word2) {
        char[] m = word1.toCharArray();
        char[] n = word2.toCharArray();
        int[][] dp = new int[m.length + 1][n.length + 1];

        for(int i = 1; i <= n.length; i++){
            dp[0][i] = i;
        }

        for(int j = 1; j <= m.length; j++){
            dp[j][0] = j;
        }


        for(int j = 1; j <= m.length; j++){
            for(int i = 1; i <= n.length; i++){

                if(m[j - 1] == n[i - 1]){
                    dp[j][i] = dp[j - 1][i - 1];
                } else {
                    dp[j][i] = Math.min(dp[j - 1][i - 1], Math.min(dp[j][i - 1], dp[j - 1][i])) + 1;
                }
            }
        }

        return dp[m.length][n.length];
    }
}
