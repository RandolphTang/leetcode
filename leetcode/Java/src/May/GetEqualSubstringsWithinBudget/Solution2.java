package May.GetEqualSubstringsWithinBudget;

public class Solution2 {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] diff = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int j = 0;

        for(int i = 0; i < s.length(); ++i){
            maxCost -= diff[i];

            if(maxCost < 0){
                maxCost += diff[j++];
            }
        }

        return s.length() - j;
    }
}
