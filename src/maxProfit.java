public class maxProfit {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else {
                profit = prices[i]-buy;
                if(maxProfit<profit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
