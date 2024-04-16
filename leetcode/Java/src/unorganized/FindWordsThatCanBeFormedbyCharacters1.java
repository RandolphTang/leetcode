package unorganized;

public class FindWordsThatCanBeFormedbyCharacters1 {
    public int countCharacters(String[] words, String chars) {
        int[] alphabets = new int[26];
        int ans = 0;

        for(final char eachChar: chars.toCharArray()){
            alphabets[eachChar - 'a']++;
        }

        for(final String word: words){
            int[] copy = alphabets.clone();
            ans += word.length();
            for(final char charW: word.toCharArray()){
                if(--copy[charW - 'a'] < 0){
                    ans -= word.length();
                    break;
                }
            }
        }

        return ans;
    }
}
