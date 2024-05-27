package May.TheNumberOfBeautifulSubsets;

public class Solution {
    private int[] freqMap = new int[1001];
    private int count = 0;

    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        backtracking(0, nums, freqMap, k);
        return count;
    }

    private void backtracking(int j, int[] nums, int[] freqMap, int k){

        for(int i = j; i < nums.length; i++){

            if(freqMap[nums[i] - k] > 0){
                continue;
            }

            freqMap[nums[i]]++;
            count++;
            backtracking(i + 1, nums, freqMap, k);
            freqMap[nums[i]]--;

        }
    }
}
