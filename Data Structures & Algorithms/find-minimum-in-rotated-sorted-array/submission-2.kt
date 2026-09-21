class Solution {
    fun findMin(nums: IntArray): Int {
 var minValue = Int.MAX_VALUE
        var left = 0
        var right = nums.size-1
        while(left <= right){
            val mid = left+(right-left)/2
            minValue = minOf(minValue,nums[mid])
            if(nums[mid] <= nums[right]){
              right = mid-1
            }else{
                left =mid+1
            }
        }
        return minValue

    }
}
