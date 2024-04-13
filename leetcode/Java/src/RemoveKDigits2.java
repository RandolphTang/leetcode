public class RemoveKDigits2 {
    public String removeKdigits(String num, int k) {
        if(num.length() == k){
            return "0";
        }

        char[] num2 = num.toCharArray();
        char[] target = new char[num.length()];


        int targetValueLoc = -1;
        int removeValue = k;

        for(int i = 0; i < num.length(); i++){

            while(targetValueLoc >= 0 && removeValue > 0
                    && target[targetValueLoc] > num2[i]){
                targetValueLoc--;
                removeValue--;

            }

            targetValueLoc++;

            target[targetValueLoc] = num2[i];
        }

        int removeZero = 0;

        while(target[removeZero] == '0' && removeZero < target.length - k - 1){
            removeZero++;
        }

        return String.valueOf(target, removeZero, num2.length - k - removeZero);
    }
}
