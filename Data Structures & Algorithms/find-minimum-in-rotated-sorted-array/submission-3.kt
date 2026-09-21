class Solution {
    fun findMin(nums: IntArray): Int {
if(nums.isEmpty()) return Int.MIN_VALUE
        var left = 0
        var right = nums.lastIndex
        var min = Int.MAX_VALUE

        while(left <= right){
           val mid = left + (right-left)/2
             min = minOf(min,nums[mid])
           if(nums[mid] <= nums[right]){
            right = mid-1
           }else{
             left = mid+1
           }
         
        }
        return min
    }
}
