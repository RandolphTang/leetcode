public class ReverseInteger1 {
    public int reverse(int x) {
        boolean isNegative = x < 0;

        x = Math.abs(x);
        int num = 0;

        while(x > 0) {

            if(Integer.MAX_VALUE / 10 < num) return 0; // make sure no exceed the bound before next conversion

            num = num * 10 + x % 10;
            x = x / 10;
        }

        return isNegative? -num : num;
    }
}

