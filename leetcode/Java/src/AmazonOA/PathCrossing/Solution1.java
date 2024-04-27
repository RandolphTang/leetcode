package AmazonOA.PathCrossing;

public class Solution1 {
    public boolean isPathCrossing(String path) {
        HashSet<Pair<Integer,Integer>> set = new HashSet<>();
        set.add(new Pair(0,0));
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length();i++){
            if(path.charAt(i) == 'N'){
                y++;

            }else if(path.charAt(i) == 'S'){
                y--;

            }else if(path.charAt(i) == 'E'){
                x++;

            }else {
                x--;

            }
            if(set.contains(new Pair(x,y))){
                return true;
            }else {
                set.add(new Pair(x,y));
            }
        }
        return false;

    }
}
