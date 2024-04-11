public class RevealCardsInIncreasingOrder2 {
    public int[] deckRevealedIncreasing(int[] deck) {
        //this use array instead of list so faster
        // a bit math here

        if(deck.length == 1){
            return deck;
        }

        Arrays.sort(deck);

        int[] target = new int[deck.length];
        target[0] = deck[0];
        int a = 1;
        int b = 0;

        while(a < deck.length){
            for(int i = 1; i < deck.length; i++){

                if(target[i] == 0){
                    b++;
                    if(b == 2){

                        target[i] = deck[a++];
                        b = 0;
                    }
                }

            }
        }
        return target;
    }
}
