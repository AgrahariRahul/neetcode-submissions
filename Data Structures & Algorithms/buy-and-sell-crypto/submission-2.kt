class Solution {
   // 10,1,55,6,7,1
    fun maxProfit(prices: IntArray): Int {
          var maxProfit = 0
          var minBuy = Int.MAX_VALUE
          var index = 0
          for(price in prices){
            maxProfit = maxOf(maxProfit,price-minBuy)
            minBuy = minOf(minBuy,price)
          }
          println("Result : $maxProfit")
          return maxProfit
    }
}
