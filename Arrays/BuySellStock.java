package Arrays;

/**
  Best Time to Buy and Sell Stock
  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BuySellStock {
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i]-minPrice;
            maxProfit = Math.max(maxProfit, cost);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
   public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    System.out.println("Max profit is : "+maxProfit(prices));
   } 
}