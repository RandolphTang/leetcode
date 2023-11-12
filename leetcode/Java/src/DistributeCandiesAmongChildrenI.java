public class DistributeCandiesAmongChildrenI {
    public int distributeCandies(int n, int limit) {
        int result = 0;
        for (int i = 0; i <= Math.min(n, limit); i++){
            for (int j = 0; j <= Math.min(n - i, limit); j++){
                int k = n - j - i;
                if(k <= limit){
                    result += 1;
                }

            }
        }
        return result;
    }
}
