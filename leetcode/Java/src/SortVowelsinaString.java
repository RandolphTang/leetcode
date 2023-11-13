public class SortVowelsinaString {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        char[] chars = s.toCharArray();

        for(char c: chars) {

            char d = Character.toLowerCase(c);

            if(d == 'a' || d == 'e' ||d == 'i' || d =='o' ||d == 'u') {
                vowels.add(c);
            }

        }

        Collections.sort(vowels);

        for(int i = 0, j =0; i < chars.length; ++i) {
            char e = Character.toLowerCase(chars[i]);
            if(e == 'a' ||e == 'e' || e =='i' ||e == 'o' || e =='u') {
                chars[i] = vowels.get(j++);
            }

        }
        return String.valueOf(chars);
    }
}
