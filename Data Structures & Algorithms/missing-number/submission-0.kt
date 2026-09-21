class Solution {
    fun missingNumber(nums: IntArray): Int {
      var sum = 0
      for(i in 0..nums.size){
       sum+=i
       if(i<nums.size){
        sum = sum-nums[i]
       }
      }
      return sum
    }
}
