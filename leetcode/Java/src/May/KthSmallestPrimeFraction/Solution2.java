package May.KthSmallestPrimeFraction;

public class Solution2 {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        final int n = arr.length;
        double l = 0.0;
        double r = 1.0;

        while(l < r){
            final double m = (l + r) / 2.0;
            int noGreaterThanM = 0;
            int p = 0;
            int q = 1;

            for(int i = 0, j = 1; i < n; i++){
                while(j < n && arr[i] * 1.0 / arr[j] > m){
                    j++;
                }
                if(j == n) break;
                noGreaterThanM += n - j;

                if(p * 1.0 / q < arr[i] * 1.0 / arr[j]){
                    p = arr[i];
                    q = arr[j];
                }
            }

            if(noGreaterThanM == k){
                return new int[]{p, q};
            }

            if(noGreaterThanM > k) r = m;
            else l = m;
        }

        throw new IllegalArgumentException();
    }
}
