package May.LongestCommonSubsequence;

public class Solution3 {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.length() < text2.length()) return longestCommonSubsequence(text2, text1);

        int n = text1.length();
        int m = text2.length();

        int[] prev = new int[m + 1];
        int[] curr = new int[m + 1];

        for(int j = 0; j < n; j++){
            for(int i = 0; i < m; i++){
                if(text2.charAt(i) == text1.charAt(j)){
                    curr[i + 1] = prev[i] + 1;
                } else {
                    curr[i + 1] = Math.max(prev[i + 1], curr[i]);
                }
            }

            var temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[prev.length - 1];
    }
}
