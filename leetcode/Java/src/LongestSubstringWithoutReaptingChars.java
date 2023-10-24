public class LongestSubstringWithoutReaptingChars {

    // for this problem, we want to find the substring with longest length without repeating
    // so scenarios we need to consider is when there is a same character, we need to remove
    // the first appeared same character.
    // Second scenarios we need to consider is that we want a substring, so the letters appeared
    // before the original redundant character should also be wiped out.

    public int lengthOfLongestSubstring(String s) {

        List<Character> resultList = new ArrayList<>(); //create an arraylist to store the expected outcome
        int maxLength = 0; // initialize the maxLength to record longest length

        for (int i = 0; i < s.length(); i++) { // use an iteration to loop all character in input string s

            if (resultList.contains(s.charAt(i))) { // if present redundant character, remove it
                int indexChar = resultList.indexOf(s.charAt(i))); // find the position in resultList
                resultList.remove(indexChar);

                if (indexChar > 0) { // if redundant char is already part of substring (or sequence)
                    resultList.subList(0, indexChar).clear(); // clear all past character before redundant char
                }
            }

            resultList.add(s.charAt(i));
            maxLength = Math.max(maxLength, resultList.size()); // update the maxLength when new longest length occur
        }

        return maxLength;
    }

}
