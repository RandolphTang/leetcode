import java.util.PriorityQueue;

public class SeatReservationManager2 {

    //This question is fairly easy if you use priorityQueue
    //PQ automatically helps you to sort out value
    //PQ is default min-priority, you can use reverseOrder() to change to max-priority

    //Improtant methods of PQ to use in this problem
    //offer(element) "push in" the new elements based on priority setting

    //not the best solution

    private PriorityQueue<Integer> seatManager;
    private int pointer = 0;

    public SeatManager(int n) {

            seatManager = new PriorityQueue<>();

    }

    public int reserve() {
        if(seatManager.isEmpty()) {
            return ++pointer;  //so at first no elements in seatManager, which considered all unreserved
                                // then from min reserve the seat, if there continues unreserve method no calling
                                // increment the pointer
        } else {
            return seatManager.poll(); // if there is unreserved seat, return the min
        }
    }

    public void unreserve(int seatNumber) {
        seatManager.offer(seatNumber);
    }
}
