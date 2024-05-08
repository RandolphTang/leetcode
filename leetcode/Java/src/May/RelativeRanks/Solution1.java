package May.RelativeRanks;

public class Solution1 {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> m = new HashMap<>();
        String[] s = new String[score.length];


        for(int i = 0; i < score.length; i++){
            m.put(score[i], i);
        }

        Arrays.sort(score);

        for(int i = 0; i < score.length; i++){
            if(i == score.length - 1){
                s[m.get(score[i])] = "Gold Medal";
            } else if(i == score.length - 2) {
                s[m.get(score[i])] = "Silver Medal";
            } else if(i == score.length - 3) {
                s[m.get(score[i])] = "Bronze Medal";
            } else {
                s[m.get(score[i])] = String.valueOf(score.length - i);
            }

        }

        return s;
    }
}
