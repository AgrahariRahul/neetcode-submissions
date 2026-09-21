class Solution {
  fun maxProfit(prices: IntArray): Int {
        var minBuy = Int.MAX_VALUE
        var profit = 0
        for(price in prices){
            minBuy = minOf(minBuy,price)
            profit = maxOf(profit, price-minBuy)
        }
        return profit
    }
}
