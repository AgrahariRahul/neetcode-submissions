class Solution {
    fun maxProduct(nums: IntArray): Int {
     var currentMin = nums[0]
        var currentMax = nums[0]
        var max = nums[0]

        for(index in 1..nums.lastIndex){
            val prevMin = currentMin
            val prevMax = currentMax
            val num = nums[index]
            currentMin = minOf(num, prevMin*num, prevMax*num)
            currentMax = maxOf(num, prevMin*num, prevMax*num)
            max = maxOf(max,currentMax)

        }
        return max
    }
}
