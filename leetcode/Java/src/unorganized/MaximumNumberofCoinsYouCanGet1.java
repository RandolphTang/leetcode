package unorganized;

public class MaximumNumberofCoinsYouCanGet1 {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int count = 0;
        int bound = piles.length / 3;
        for(int i = piles.length - 2; i >= bound; i-=2) {
            count += piles[i];
        }

        return count;
    }
}
