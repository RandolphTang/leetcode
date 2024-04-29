package April.BestTimetoBuyandSellStock;

public class Solution1 {
    public int maxProfit(int[] prices) {
        int sellO = 0;
        int holdO = Integer.MIN_VALUE;

        for(int price: prices){
            sellO = Math.max(sellO, holdO + price);
            holdO = Math.max(holdO, -price);
        }

        return sellO;
    }
}
