public class FrequencyoftheMostFrequentElement2 {
    public int maxFrequency(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[] count = new int[max - min + 1];
        for (int num : nums) count[num - min]++;
        int maxFreq = 0, start = 0, cnt = 0, sum = 0, startCnt = count[0];
        for (int i = 0; i < count.length; i++) {
            sum += cnt;
            cnt += count[i];
            while (sum > k ) {
                while  (startCnt == 0) startCnt = count[++start];
                sum -= i - start;
                cnt--;
                startCnt--;
            }
            maxFreq = Math.max(maxFreq, cnt);
        }
        return maxFreq;
    }
}
