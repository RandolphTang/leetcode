package unorganized;

public class RevealCardsInIncreasingOrder1 {


    public int[] deckRevealedIncreasing(int[] deck) {

        List<Integer> result = new ArrayList<>();
        int[] finalR = new int[deck.length];

        Arrays.sort(deck);

        for(int i = 0; i < deck.length; i++){

            result.add(0, deck[deck.length - i - 1]);

            if(result.size() >= 3) {
                result.add(1, result.get(result.size() - 1));
                result.remove(result.size() - 1);
            }

        }

        for(int i = 0; i < deck.length; i++) {
            finalR[i] = result.get(i);
        }

        return finalR;

    }
}
