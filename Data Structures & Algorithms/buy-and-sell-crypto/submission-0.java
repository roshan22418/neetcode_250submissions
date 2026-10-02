class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int maxProfit = 0;
        int lent = prices.length;
        for(int i = 1;i<lent;i++){
            int profit = prices[i]-low;
            low = Math.min(low,prices[i]);
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
        
    }
}
