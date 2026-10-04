class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        int minValue = prices[0];
        for(int i = 1;i<prices.length;i++){
            int tempProfit = prices[i]-minValue;
            if(tempProfit>profit){
                maxProfit += tempProfit;
                profit = 0;
                minValue = prices[i]; 
            }
            else{
                minValue = prices[i];
            }
        }
        return maxProfit;
        
    }
}