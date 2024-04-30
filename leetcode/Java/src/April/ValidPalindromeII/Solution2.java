package April.ValidPalindromeII;

public class Solution2 {
    public boolean validPalindrome(String s) {
        return isValid(0,s.length()-1,s,true);
    }

    private boolean isValid(int lb, int ub, String s, boolean deletionAllowed){
        int i = lb;
        int j = ub;
        for(;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                if(deletionAllowed==false)
                    return false;
                return isValid(i+1,j,s,false) || isValid(i,j-1,s,false);
            }
        }

        return true;
    }
}
