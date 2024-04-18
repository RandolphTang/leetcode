package AmazonOA.MinimumNumberofKeypresses;

public class solution1 {
    public int minimumKeypresses(String s) {

        int[] res = new int[26];


        for(char ch : s.toCharArray()){
            res[ch-'a']++;
        }

        int sum = 0;
        int taken = 0;
        Arrays.sort(res);

        for(int i = 25; i >= 0; i--){
            if(res[i] > 0){
                sum += (res[i] * ((taken/9)+1));
                taken++;
            }


            // if(i >= 17){
            //     sum += res[i];
            // } else if (i >= 8) {
            //     sum += (res[i] * 2);
            //} else {
            //     sum += (res[i] * 3);
            //}
        }

        return sum;
    }
}
