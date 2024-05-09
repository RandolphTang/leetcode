package May.MaximizeHappinessofSelectedChildren;

public class Solution1 {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        int count = 0;

        Arrays.sort(happiness);

        for(int i = happiness.length - 1; i >= 0; i--){

            happiness[i] = happiness[i] - count;

            if(k == 0 || happiness[i] <= 0) break;

            ans += happiness[i];
            count += 1;
            k--;


        }

        return ans;
    }
}
