class Solution {
    fun maxProfit(prices: IntArray): Int {
       var minBuy = Int.MAX_VALUE
       var res = 0
       for(price in prices){
        minBuy = minOf(price,minBuy)
        var currentProfit = price-minBuy
        res = maxOf(currentProfit,res)
       }
       return res
    }
}
