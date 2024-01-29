public class DistributeCandiesAmongChildren2 {

    public int distributeCandies(int n, int limit) {
        int total = (n+2) * (n+1) / 2;
        //this equation is from the total sum equation
        // says if you have k children, n candies
        // the sum of possible combination is
        // ((m+k−1)!) / ((k−1)!×m!)
        // ! factorial 5! == 5!=5×4×3×2×1=120;


        // Exclude at least one person get more than limit candies. Use PIE.

        // One person gets at least (limit + 1) candies
        int a = 0;
        if (limit + 1 <= n) {
            a = (n - limit + 1) * (n - limit) / 2;
        }

        // Two person each get at least (limit + 1) candies
        int b = 0;
        if ((limit + 1) * 2 <= n) {
            b = (n - 2*limit) * (n - 2*limit-1) / 2;
        }

        // Three person each get at least (limit + 1) candies
        int c = 0;
        if ((limit + 1) * 3 <= n) {
            c = (n - 3*limit - 1) * (n - 3*limit - 2) / 2;
        }

        return total - (a * 3 - b * 3 + c);
    }

}
