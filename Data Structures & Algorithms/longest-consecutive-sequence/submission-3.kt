class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()
        var res = 0 
        for(num in nums){
           if((num-1) !in set){
            var current = num
            var length = 0
            while(current in set){
              length++
              current++
            }
            res = maxOf(res,length)
           }
        }
        return res
    }
}
