## Best Time to Buy and Sell Stock - Part 1

Challenge is available at: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

You are given an array prices where prices[i] is the price of a given stock on the ith day.  

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.  

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

**Example 1:**  
`Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.`

**Example 2:**  
`Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.`

**Constraints:**  
- 1 <= prices.length <= 105
- 0 <= prices[i] <= 104

**Guidelines**:
- Put all code in `BuySellStock` class so that it can be verified at the source site.  


## Best Time to Buy and Sell Stock - Part 2

Challenge is available at: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/

You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete at most two transactions.

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).


**Example 1:**  
`Input: prices = [3,3,5,0,0,3,1,4]  
Output: 6  
Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.  
Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.`  

**Example 2:**  
`Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before buying again.
`

**Example 3:**  
`Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
`  

**Constraints:**
- 1 <= prices.length <= 105
- 0 <= prices[i] <= 105

**Guidelines**:
- Put all code in `BuySellStockAdvanced` class so that it can be verified at the source site.  
