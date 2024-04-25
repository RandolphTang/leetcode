package AmazonOA.MinimumHealthtoBeatGame;

public class Solution1 {
    public long minimumHealth(int[] damage, int armor) {
        int maxP = 0;
        long health = 0;

        for(int eachD: damage){
            if(eachD > maxP) maxP = eachD;
            health += eachD;
        }

        if(maxP > armor) maxP = armor;

        return (health - maxP + 1);
    }
}
