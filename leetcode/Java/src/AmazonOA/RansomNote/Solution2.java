package AmazonOA.RansomNote;

public class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int i = magazine.indexOf(c, letters[c - 'a']);
            if (i == -1)
                return false;
            letters[c - 'a'] = i + 1;
        }
        return true;
    }
}
