public class LongestPalindromicSubstring2 {
    public String longestPalindrome(String s) {

        // another version of middle-out method
        // faster than version 1, because less redundant

        int result = 0; // used to compare each result
        int start = 0, end = 0; // used to define result

        for (int i = 0; i < s.length(); i++) {

            int left = i - 1; // searching index

            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                ++i;
            }

            int right = i + 1;

            while (left >= 0 && right < s.length() &&
                    s.charAt(left) == s.charAt(right)) {
                --left;
                ++right;
            }

            if(right - left > result) {
                result = right - left;
                start = left + 1;
                end = right;
            }
        }

        return s.substring(start, end);
    }
}
