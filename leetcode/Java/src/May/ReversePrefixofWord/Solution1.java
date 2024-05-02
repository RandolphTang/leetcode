package May.ReversePrefixofWord;

public class Solution1 {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(ch == -1) return word;

        StringBuilder sb = new StringBuilder();

        for(int i = index; i >= 0; i--){
            sb.append(word.charAt(i));
        }

        for(int i = index + 1; i < word.length(); i++){
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }
}
