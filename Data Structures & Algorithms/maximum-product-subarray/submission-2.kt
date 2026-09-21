class Solution {
    fun maxProduct(nums: IntArray): Int {
       var currentMin = nums[0]
       var currentMax = nums[0]
       var maxProd = nums[0]

       for(i in 1..nums.lastIndex){
        val num = nums[i]
        val previousMin = currentMin
        val previousMax = currentMax

        currentMax = maxOf(num,num*previousMax,num*previousMin)
        currentMin = minOf(num, num*previousMax,num*previousMin)
        maxProd = maxOf(maxProd,currentMax)
       }
       return maxProd
    }
}
