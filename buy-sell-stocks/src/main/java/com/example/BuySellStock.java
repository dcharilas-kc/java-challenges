package com.example;

public class BuySellStock {

    public int maxProfit(int[] prices) {

        // Strategy: start from the last day and work backwards.  Note the best possible selling
        // price for each day by carrying along the max.
        int maxProfit = 0;
        int maxSellingPrice = 0;
        for (int day=prices.length-1; day>=0; day--) {
            int dayPrice = prices[day];
            int profit = maxSellingPrice - dayPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (dayPrice > maxSellingPrice) {
                maxSellingPrice = dayPrice;
            }
        }

        return maxProfit;
    }
}
