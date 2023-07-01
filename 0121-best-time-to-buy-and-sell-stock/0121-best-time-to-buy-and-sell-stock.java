class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyAmount = prices[0];
        for(int i =1;i<prices.length;i++){
            // if the stock is avaible for less on current day then buy it
            if(prices[i]<buyAmount){
                buyAmount = prices[i];
            }
            // sell the stock in other case
            else{
                profit = Math.max(profit,prices[i]-buyAmount);
            }
        }
        return profit;
    }
}