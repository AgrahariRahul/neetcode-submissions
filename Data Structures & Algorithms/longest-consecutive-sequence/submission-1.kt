class Solution {
    fun longestConsecutive(nums: IntArray): Int {
      val set = nums.toSet()
      var len = 0
      for((i,num) in nums.withIndex()){
      
        if(num-1 !in set){
           var currentLen = 0
        var current = num
          while(current in set){
            currentLen++
            current++
          }
          len = maxOf(len,currentLen)
        }
      }
      return len
    }
}
