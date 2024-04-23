package AmazonOA.RansomNote;

public class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] allCharR = new int[26];
        char[] n = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();

        for(char eachC: n){
            allCharR[eachC - 'a']++;
        }

        for(char eachC: m){
            allCharR[eachC - 'a']--;
        }

        for(char eachC: n){
            if(allCharR[eachC - 'a'] > 0) return false;
        }

        return true;


    }
}
