class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minprice = prices[0];
        int profit=0;
        int maxprofit=0; 
        
        for(int i=0; i<n; i++){
            minprice = Math.min(prices[i] , minprice);
            profit = prices[i] - minprice;
            maxprofit = Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}