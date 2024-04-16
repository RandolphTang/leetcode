package unorganized;

public class LongestPalindromicSubstring3 {
    public String longestPalindrome(String s) {
        // dynamic programming method, not really
        // optimal for this question though
        // dynamic programming is good when looking for
        // optimization solutions, combinatorial problem (salesman problem)
        // more approach to searching combination

        int len = s.length();
        int max = 0, left = 0, right = 1;

        var isPalindromic = new boolean[len][len];

        // one character of dynamic programming is reusing the sub problem
        // and a clear recurrence relation

        for(int i = len - 1; i >= 0; i--) {
            for(int j = i; j < len; j++) {
                if (i == j) {
                    isPalindromic[i][j] = true;
                } else if (s.charAt(i) == s.charAt(j)) {
                    if(i + 1 == j) {
                        isPalindromic[i][j] = true;
                    } else {
                        isPalindromic[i][j] = isPalindromic[i + 1][j - 1];
                        //reference old values to check if they are palindromic as well
                    }
                }

                if(isPalindromic[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    left = i;
                    right = j + 1;
                }
            }
        }

        return s.substring(left, right);

    }
}
