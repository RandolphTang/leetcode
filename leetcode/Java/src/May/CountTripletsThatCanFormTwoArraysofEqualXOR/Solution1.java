package May.CountTripletsThatCanFormTwoArraysofEqualXOR;

public class Solution1 {
    public int countTriplets(int[] arr) {
        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            int xors = arr[i];
            for(int k = i + 1; k < arr.length; k++){
                xors ^= arr[k];

                if(xors == 0){
                    ans += (k - i);
                }
            }
        }

        return ans;
    }
}
