class Solution {
    fun maxProfit(prices: IntArray): Int {
       var buy = 0
       var sell = 1
       var maxP = 0

       while(sell < prices.size){
         if(prices[sell] > prices[buy]){
          maxP = maxOf(prices[sell]-prices[buy],maxP)
         }else{
            buy = sell
         }
         sell++
       }
       println("maxP: ${maxP}")
       return maxP
    }
    
}
