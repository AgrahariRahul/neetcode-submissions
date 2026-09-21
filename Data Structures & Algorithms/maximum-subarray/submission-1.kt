class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxSub = nums[0]
        var curSum = 0

        for(num in nums){
            if(curSum < 0){
                curSum = 0
            }
            curSum = curSum+num
            maxSub =maxOf(maxSub,curSum)
        }
        return maxSub
    }
}
