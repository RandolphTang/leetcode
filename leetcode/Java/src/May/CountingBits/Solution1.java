package May.CountingBits;

public class Solution1 {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        int curr = 0;

        for(int i = 0; i <= n; i++){
            curr = i;
            while(curr > 0){
                arr[i] += curr & 1;
                curr >>= 1;
            }
        }

        return arr;
    }
}
