class Solution {
  fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int>()
        for((i,num) in nums.withIndex()){
            val diff = target-num
            if(diff in map && ( (map[diff]!!) !=i)){
                return intArrayOf(map[diff]!!,i)
            }
            map[num] = i
        }
        return intArrayOf()
    }
}
