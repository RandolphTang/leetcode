public class FindtheWinnerOfanArrayGame {

    public int getWinner(int[] arr, int k) {

        //for this question, only worry about
        // the largest number when it comes to
        // a certain number of searching

        // a good problem to train to
        // understand core goal of a problem rather
        // than the surface examples given by given problem

        int consecutive = 0;
        target = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(target < arr[i]) {
                target = arr[i];
                consecutive = 0;
            }

            consecutive++;
            if(consecutive == k) break;
        }

        return target;
    }
}
