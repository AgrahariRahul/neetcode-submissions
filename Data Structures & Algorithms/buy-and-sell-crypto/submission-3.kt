class Solution {
    fun maxProfit(prices: IntArray): Int {
       var maxProfit = Int.MIN_VALUE
       var minBuy = Int.MAX_VALUE

       for(price in prices){
        minBuy = minOf(price,minBuy)
        maxProfit = maxOf(maxProfit, price-minBuy)
       }
       return maxProfit
    }
}
