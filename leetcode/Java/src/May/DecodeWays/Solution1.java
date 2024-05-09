package May.DecodeWays;

public class Solution1 {
    public int numDecodings(String s) {
        final int n = s.length();
        int[] count = new int[n + 1];

        count[n] = 1;
        count[n - 1] = isValid(s.charAt(n - 1)) ? count[n] : 0;

        for(int i = n - 2; i >= 0; i--){
            if(isValid(s.charAt(i))){
                count[i] += count[i + 1];
            }

            if(isValid(s.charAt(i), s.charAt(i + 1))){
                count[i] += count[i + 2];
            }
        }

        return count[0];

    }

    private boolean isValid(char c){
        return c != '0';
    }

    private boolean isValid(char c, char d){
        return c == '1' || c == '2' && d < '7';
    }
}
