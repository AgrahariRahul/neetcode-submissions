class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int, Int>()
        for(i in nums.indices){
            var rem = target-nums[i]
            if(map.containsKey(rem)){
                return intArrayOf(map[rem]!!,i)
            }
            map[nums[i]] = i
        }
        return IntArray(2)
    }
}
