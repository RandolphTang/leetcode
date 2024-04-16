package unorganized;

public class CountNumberofHomogenousSubstrings {
    public int countHomogenous(String s) {
        int sum = 0;
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(i > 0 && s.charAt(i) == (s.charAt(i - 1))) {
                count++;
            } else {
                count = 1;
            }

            sum = (sum + count) % 1000000007;
        }

        return sum;
    }
}
