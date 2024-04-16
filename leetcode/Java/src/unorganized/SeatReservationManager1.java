package unorganized;

import java.util.PriorityQueue;

public class SeatReservationManager1 {

    //This question is fairly easy if you use priorityQueue
    //PQ automatically helps you to sort out value
    //PQ is default min-priority, you can use reverseOrder() to change to max-priority

    //Improtant methods of PQ to use in this problem
    //offer(element) "push in" the new elements based on priority setting

    private PriorityQueue<Integer> seatManager;

    public SeatManager(int n) {

        seatManager = new PriorityQueue<Integer>();

        for(int i = 1; i < n + 1; i++) {
            seatManager.offer(i);
        }
    }

    public int reserve() {
        return seatManager.poll(); // auto remove the default priority value
    }

    public void unreserve(int seatNumber) {
        seatManager.offer(seatNumber);
    }
}
