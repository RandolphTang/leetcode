public class SumofAbsoluteDifferencesinaSortedArray {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int size = nums.length;
        int[] prefix = new int[size];
        int[] suffix = new int[size];
        int[] ans = new int[size];

        prefix[0] = nums[0];
        for(int i = 1; i < size; i++){
            prefix[i] = nums[i] + prefix[i - 1];
        }

        suffix[size - 1] = nums[size - 1];
        for(int j = size - 2; j >= 0; j--){
            suffix[j] = nums[j] + suffix[j + 1];
        }

        for(int z = 0; z < size; z++) {
            final int left = nums[z] * (z + 1) - prefix[z];
            final int right = suffix[z] - nums[z] * (size - z);
            ans[z] = left + right;
        }

        // says [1, 4, 6, 8, 10]
        // for 6's answer in the target list, answer = (6 - 1) + (6 - 4) + ( 6 - 6) + (8 - 6) + (10 -6)
        // so if we divide into prefix (left) and suffix (right) calculation
        // equals 6 * 3 - ( 1 + 4 + 6), which equals 6 * (curr location) - cumulative value until 6

        return ans;
    }
}
