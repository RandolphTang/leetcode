public class ReductionOperationstoMaketheArrayElementsEqual2 {
    public int reductionOperations(int[] nums) {
        int[] frq = new int[50001];

        for(int i = 0 ; i < nums.length; i++) {
            frq[nums[i]]++;
        }

        int frqSum = 0;
        int frqCount = 0;

        for(int i = frq.length - 1; i >= 0; i--) {
            if(frq[i] != 0) {
                frqSum += frq[i];
                frqCount += frqSum - frq[i];
            }
        }

        return frqCount;
    }
}
