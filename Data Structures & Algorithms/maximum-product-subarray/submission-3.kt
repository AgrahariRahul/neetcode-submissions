class Solution {
    fun maxProduct(nums: IntArray): Int {
       var min = nums[0]
       var max = nums[0]
       var res = nums[0]

       for(index in 1..nums.lastIndex){
         val num =nums[index]
          var prevMin = min
          var prevMax = max

          val currentMin = minOf(num,prevMin*num,prevMax*num)
          val currentMax = maxOf(num,prevMin*num,prevMax*num)
          res = maxOf(res,currentMax,currentMin)
          min = currentMin
          max = currentMax
       }
       return res
    }
}
