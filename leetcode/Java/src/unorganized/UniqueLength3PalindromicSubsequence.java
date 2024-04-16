package unorganized;

import java.util.HashSet;

public class UniqueLength3PalindromicSubsequence {
    public int countPalindromicSubsequence(String s) {
        int count = 0;

        for(char i = 'a'; i <= 'z'; i++) {
            //ASCII value is used here, and ASCII value follows the alphabet order
            int indexFirst = s.indexOf(i), indexLast = s.lastIndexOf(i);
            HashSet<Character> charSets = new HashSet<>();

            for(int j = indexFirst + 1; j < indexLast; j++){
                charSets.add(s.charAt(j));
            }

            count += charSets.size();
        }

        return count;
    }
}
