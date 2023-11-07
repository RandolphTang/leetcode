import java.util.PriorityQueue;

public class SeatReservationManager2 {

    //This only used vector, which I guess saves runtime compared to
    //Priority Queue for this problem

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
