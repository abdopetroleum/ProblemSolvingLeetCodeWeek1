package BestTimetoBuyandSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i]<prices[0]){
                prices[0]=prices[i];
            }else {
                maximumProfit=(prices[i]-prices[0]>maximumProfit)?(prices[i]-prices[0]):maximumProfit;
            }
        }
        return maximumProfit;
    }
    public  int maxProfitMoreReadable(int[] prices) {
        int lowestPrice=prices[0];
        int maximumProfit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i]<lowestPrice){
                lowestPrice=prices[i];
                continue;
            }
            if(prices[i]-lowestPrice>maximumProfit){
                maximumProfit=prices[i]-lowestPrice;
            }
        }
        return maximumProfit;
    }
}