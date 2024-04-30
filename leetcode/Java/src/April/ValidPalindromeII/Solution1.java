package April.ValidPalindromeII;

public class Solution1 {
    public boolean validPalindrome(String s) {
        for(int l = 0, r = s.length() - 1; l < r; l++, r--){
            if(s.charAt(l) != s.charAt(r)){
                return validPalindrome(l + 1, r, s) || validPalindrome(l, r - 1, s);
            }
        }

        return true;
    }

    private boolean validPalindrome(int l, int r, String s){
        while(l < r){

            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}
