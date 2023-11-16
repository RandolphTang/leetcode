public class FindUniqueBinaryString1 {
    public String findDifferentBinaryString(String[] nums) {
        int count = nums.length;
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < count; i++) {
            ans.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }

        return ans.toString();
    }
}
