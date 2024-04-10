public class RevealCardsInIncreasingOrder1 {
    // this solution can not handle large cases only 28/33 passed

    public int[] deckRevealedIncreasing(int[] deck) {
        int max = 0;
        int maxLoc = 0;
        int maxL = 0;
        List<Integer> result = new ArrayList<>();
        int[] finalR = new int[deck.length];

        for(int i = 0; i < deck.length; i++){
            for(int j = 0; j < deck.length; j++){
                if(deck[j] != 0 && deck[j] > max){
                    max = deck[j];
                    maxLoc = j;
                }
            }

            result.add(0, max);
            if(result.size() >= 3) {
                result.add(1, result.get(result.size() - 1));
                result.remove(result.size() - 1);
            }

            max = 0;
            deck[maxLoc] = 0;
        }

        for(int i = 0; i < deck.length; i++) {
            finalR[i] = result.get(i);
        }

        return finalR;

    }
}
