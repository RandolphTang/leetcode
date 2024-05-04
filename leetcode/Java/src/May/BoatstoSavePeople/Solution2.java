package May.BoatstoSavePeople;

public class Solution2 {
    public int numRescueBoats(int[] people, int limit) {

        int[] wegF = new int[limit + 1];
        int boat = 0;
        int start = 0;
        int end = limit;

        for(int weg: people){
            wegF[weg]++;
        }

        while(start <= end){
            while(start <= end && wegF[start] <= 0) start++;
            while(start <= end && wegF[end] <= 0) end--;

            if(wegF[start] <= 0 && wegF[end] <= 0) break;

            boat++;
            if(start + end <= limit){
                wegF[start]--;
            }
            wegF[end]--;
        }

        return boat;
    }
}
