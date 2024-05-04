package May.BoatstoSavePeople;

public class Solution1 {
    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        Arrays.sort(people);

        for(int i = 0, j = people.length - 1; i <= j; ans++){
            int remain = limit - people[j--];
            if(remain >= people[i]) i++;
        }

        return ans;
    }
}
