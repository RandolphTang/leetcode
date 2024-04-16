package unorganized;

public class ArithmeticSubarrays1 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> ans = new ArrayList();
        for(int i = 0; i < l.length; i++) {
            int[] eachB = new int[r[i] - l[i] + 1];

            for(int j = 0; j < eachB.length; j++) {
                eachB[j] = nums[l[i] + j];
            }

            ans.add(check(eachB));
        }

        return ans;
    }

    private boolean check(int[] arr) {

        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for(int i = 2; i < arr.length; i++) {
            if(arr[i] - arr[i - 1] != diff) return false;
        }

        return true;
    }
}
