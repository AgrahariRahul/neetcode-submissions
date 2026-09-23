class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minBuy = Int.MAX_VALUE
        var max = 0

        for(num in prices){
            minBuy = minOf(num,minBuy)
            max = maxOf(max,num-minBuy)
        }
        return max
    }
}
