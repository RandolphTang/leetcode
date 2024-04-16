package unorganized;

public class TimeNeededtoBuyTickets2 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        int target = tickets[k];

        for(int i = 0; i < tickets.length; i++){
            if(tickets[i] >= target) {
                if(i <= k){
                    count += target;
                } else {
                    count = count + target - 1;
                }
            } else {
                count += tickets[i];
            }
        }

        return count;
    }

}
