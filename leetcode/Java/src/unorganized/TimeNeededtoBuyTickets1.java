package unorganized;

public class TimeNeededtoBuyTickets1 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int smallest = tickets[k];
        int count = 0;

        if(tickets[k] == 0) {
            return 0;
        }

        for(int i = 0; i <= tickets.length - 1; i++){
            if (tickets[i] < smallest){
                smallest = tickets[i];
            }
        }

        if(smallest == tickets[k]){
            return (tickets[k] * tickets.length - (tickets.length - k - 1));
        }

        while(tickets[k] != 0){
            for(int i = 0; i <= tickets.length - 1; i++) {

                if(tickets[i] != 0) {

                    count++;
                    tickets[i]--;

                }

                if (tickets[k] == 0) {
                    break;
                }
            }
        }

        return count;

    }
}
