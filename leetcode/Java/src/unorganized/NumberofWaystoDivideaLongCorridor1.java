package unorganized;

public class NumberofWaystoDivideaLongCorridor1 {
    public int numberOfWays(String corridor) {
        final int mod = 1000000007;
        int preSeat = -1;
        int numSeat = 0;
        long ans = 1;

        for(int i = 0; i < corridor.length(); i++){
            if(corridor.charAt(i)  == 'S'){
                if(++numSeat > 2 && numSeat % 2 == 1){
                    ans = ans * (i - preSeat) % mod;
                }
                preSeat = i;
            }
        }

        return numSeat > 1 && numSeat % 2 == 0? (int)ans : 0;
    }
}
