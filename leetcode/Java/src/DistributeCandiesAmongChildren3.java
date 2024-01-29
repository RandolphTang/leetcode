public class DistributeCandiesAmongChildren3 {
    public int distributeCandies(int n, int limit) {
        return distributeCandies(n,limit,3);
    }

    public int distributeCandies(int n, int limit, int people) {
        if(people==1){
            if(n>limit)return 0;
            return 1;
        }
        int res = 0;
        for(int i=0;i<=limit;i++){
            if(n-i>=0){
                res+=distributeCandies(n-i,limit,people-1);
            }
        }
        return res;
    }
}
