class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int>()
        for(index in nums.indices){
            val rem = target-nums[index]
            if(map.containsKey(rem)){
                return intArrayOf(map[rem]!!,index)
            }
            map[nums[index]] = index
        }
        return IntArray(2)
    }
}
