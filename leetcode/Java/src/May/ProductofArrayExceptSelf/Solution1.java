package May.ProductofArrayExceptSelf;

public class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeros = 0;
        for(int n:nums){
            if(n == 0){
                zeros++;
                if(zeros >1){
                    return new int[nums.length];
                }
            }else{
                prod *= n;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(zeros == 1 && nums[i] != 0){
                nums[i] = 0;
            }else{
                if(nums[i] == 0){
                    nums[i] = prod;
                }else{
                    nums[i] = prod/nums[i];
                }
            }
        }
        return nums;
    }
}
