package May.LongestIncreasingSubsequence;

public class Solution2 {
    public int lengthOfLIS(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for(int num: nums){
            if(list.isEmpty() || num > list.get(list.size() - 1)){
                list.add(num);
            } else {
                list.set(binarySearch(list, num), num);
            }
        }

        return list.size();
    }

    private int binarySearch(List<Integer> nums, int num){
        final int i = Collections.binarySearch(nums, num);

        return i < 0? -(i + 1) : i;
    }
}
