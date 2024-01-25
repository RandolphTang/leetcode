import java.util.PriorityQueue;

public class SeatReservationManager2 {

    //This only used vector, which I guess saves runtime compared to
    //Priority Queue for this problem

    // in this solution, all seats are assumed reserved already (does not affect finding index that
    // trace true or false inside boolean[]
    // so when a great number of input, the first if condition block in reserve() helps
    // trace which index the reserve process has been proceed to.
    // so when unreserved, any random number unreserved, int unreserved changes property (even though
    // int, but is more likely a boolean (0 or -1), 0 means continue next finding of empty location
    // -1 means finding the smallest empty slot to fill seats
    // therefore, when large input, the first condtion enhance performance
    // if says the first 1 million is all reserved, it would take so long to 1 million and 1
    // than first condition helps directly find the next 1 million and 1 slot

    private boolean[] seatM;
    private int unreserved;

    private int min;


    public SeatManager(int n) {
        seatM = new boolean[n + 1];
        min = 1;
        unreserved = 0;
    }

    public int reserve() {
        if(unreserved == 0) {
            seatM[min] = true;
            return min++;
        }

        for(int i = 1; i < seatM.length; i++){
            if(!seatM[i]) {
                seatM[i] = true;
                unreserved--;
                return i;
            }
        }

        return -1;
    }

    public void unreserve(int seatNumber) {

        seatM[seatNumber] = false;
        unreserved++;

    }
}
