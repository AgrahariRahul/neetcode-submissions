class Solution {
    fun maxSubArray(nums: IntArray): Int {
      var res = nums[0]
      var currentSum = 0
      for(num in nums){
          if(currentSum<0){
            currentSum = 0
          }
          currentSum = currentSum+num
          res = maxOf(currentSum,res)
      }
      return res
    }
}
