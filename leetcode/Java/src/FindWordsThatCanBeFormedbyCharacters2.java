public class FindWordsThatCanBeFormedbyCharacters2 {
    public int countCharacters(String[] words, String chars) {
        int[] charArr = buildArray(chars);
        int ans = 0;

        for(final String word: words){
            int[] arr = buildArray(word);
            if(comparaArr(arr, charArr)){
                ans += word.length();
            }
        }

        return ans;

    }

    private int[] buildArray(String word) {
        int[] eachWord = new int[26];
        for(final char eachChar: word.toCharArray()){
            ++eachWord[eachChar - 'a'];
        }

        return eachWord;
    }

    private boolean comparaArr(int[] first, int[] second) {
        for(int i = 0; i < 26; i++){
            if(first[i] > second[i]){
                return false;
            }
        }
        return true;
    }
}
