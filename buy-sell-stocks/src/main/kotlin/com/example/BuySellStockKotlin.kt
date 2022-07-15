package com.example

class BuySellStockKotlin {

    fun maxProfit(prices: IntArray): Int {

        // Strategy: start from the last day and work backwards.  Note the best possible selling
        // price for each day by carrying along the max.
        var maxProfit = 0
        var maxSellingPrice = 0
        for (dayPrice in prices.reversed()) {
            val profit = maxSellingPrice - dayPrice
            if (profit > maxProfit) {
                maxProfit = profit
            }
            if (dayPrice > maxSellingPrice) {
                maxSellingPrice = dayPrice
            }
        }
        return maxProfit
    }
}