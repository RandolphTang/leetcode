public class SortVowelsinaString {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        char[] chars = s.toCharArray();

        for(int i = 0; i < s.length(); i++) {

            char d = Character.toLowerCase(s.charAt(i));

            if(d == 'a' || d == 'e' ||d == 'i' || d =='o' ||d == 'u') {
                vowels.add(d);
            }

        }

        Collections.sort(vowels);

        for(int i = 0, j =0; i < chars.length; i++) {
            char e = Character.toLowerCase(chars[i]);
            if(e == 'a' ||e == 'e' || e =='i' ||e == 'o' || e =='u') {
                chars[i] = vowels.get(j++);
            }

        }
        return String.valueOf(chars);
    }
}
