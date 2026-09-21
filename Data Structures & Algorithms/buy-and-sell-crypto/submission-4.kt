class Solution {
    fun maxProfit(prices: IntArray): Int {
      var minBuy = Int.MAX_VALUE
      var maxProfit =Int.MIN_VALUE
      for(price in prices){
        minBuy = minOf(minBuy,price)
        maxProfit = maxOf(maxProfit, price-minBuy)
      }
      println("minBuy $minBuy and maxProfit: ${maxProfit}")
      return maxProfit
    }
}
