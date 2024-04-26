package April.OpenTheLock;

public class Solution1 {
    public int openLock(String[] deadends, String target) {
        HashSet<String> seen = new HashSet<>(Arrays.asList(deadends));

        if(seen.contains("0000")) return -1;
        if(target.equals("0000")) return 0;

        Queue<String> possible = new ArrayDeque<>(Arrays.asList("0000"));
        int ans = 0;

        while(!possible.isEmpty()){
            ans++;
            for(int bfsLevel1 = possible.size(); bfsLevel1 > 0; bfsLevel1--){
                StringBuilder sb = new StringBuilder(possible.poll());
                for(int i = 0; i < 4; i++){
                    final char character = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(i) == '9'? '0' : (char)(sb.charAt(i) + 1));
                    String word = sb.toString();
                    if(word.equals(target)) return ans;
                    if(!seen.contains(word)) {
                        seen.add(word);
                        possible.offer(word);
                    }
                    sb.setCharAt(i, character);


                    sb.setCharAt(i, sb.charAt(i) == '0'? '9' : (char)(sb.charAt(i) - 1));
                    word = sb.toString();
                    if(word.equals(target)) return ans;
                    if(!seen.contains(word)) {
                        seen.add(word);
                        possible.offer(word);
                    }
                    sb.setCharAt(i, character);
                }
            }
        }
        return -1;
    }
}
