class Solution {
    fun longestConsecutive(nums: IntArray): Int {
       var numSet = nums.toSet()

       var longest = 0
       for(n in numSet){
          if(n-1 !in numSet){
            var current = n
            var length = 0
            while(current in numSet){
                length++
                current++
            }
            longest = maxOf(length, longest)
          }
       }
       return longest
    }
}
