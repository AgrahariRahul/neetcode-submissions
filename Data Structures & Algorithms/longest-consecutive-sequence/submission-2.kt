class Solution {
    fun longestConsecutive(nums: IntArray): Int {
       val set = nums.toSet()
       var res = 0
       for(num in set){
          if(num-1 !in set){
            var current = num
            var currentLength = 0
            while(current in set){
              current+=1
              currentLength+=1
            }
            res = maxOf(res,currentLength)
          }

      
       }
       return res
    }
}
