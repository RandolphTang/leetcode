public class LongestPalindromicSubstring1 {
    public String longestPalindrome(String s) {

        // middle out approach
        // time complexity: o(n^2)

        int strLength = s.length();

        if(strLength < 2) {
            return s; // special case in which only one character
        }

        int resultLength = 0;
        String result = "";



        for(int i = 0; i < strLength; i++) {

            //first condition: odd number
            int left = i, right = i; // initialize the bound

            while(left >= 0 &&
                    right < strLength &&
                    s.charAt(left) == s.charAt(right)) {

                if((right - left + 1) > resultLength) {
                    result = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }

                left -= 1;
                right +=1; // middle-out searching
            }


            // second condition: even
            left = i; right = i + 1; // initialize the bound

            while(left >= 0 &&
                    right < strLength &&
                    s.charAt(left) == s.charAt(right)) {

                if((right - left + 1) > resultLength) {
                    result = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }

                left -= 1;
                right +=1; // middle-out searching
            }
        }

        return result;
    }
}
