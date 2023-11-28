public class MaximumNumberofCoinsYouCanGet2 {
    public int maxCoins(int[] piles) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int[] freq = new int[max + 1];

        for(int i = 0; i < piles.length; i++){
            freq[piles[i]]++;
        }

        boolean turn = true;
        int chance = piles.length / 3;

        int i = max;
        int count = 0;

        while(chance != 0) {
            if(freq[i] > 0){
                if(turn) turn = !turn;
                else{
                    chance--;
                    turn = !turn;
                    count += i;
                }
                freq[i]--;
            } else {
                i--;
            }

        }

        return count;
    }
}
