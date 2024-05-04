package May.ThreeSum;

public class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);



        for(int i = 0; i + 2 < nums.length; i++){

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int first = nums[i];
            int second = i + 1;
            int third = nums.length - 1;

            while(second < third){

                final int sum = first + nums[second] + nums[third];

                if(sum == 0){
                    ans.add(Arrays.asList(first, nums[second++], nums[third--]));
                    while(second < third && nums[second] == nums[second - 1]) ++second;
                    while(second < third && nums[third] == nums[third + 1]) --third;
                } else if (sum < 0) {
                    ++second;
                } else {
                    --third;
                }
            }
        }

        return ans;

    }
}
