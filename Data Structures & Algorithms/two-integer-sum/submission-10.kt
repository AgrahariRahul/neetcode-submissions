class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int>()
        for((i,num) in nums.withIndex()){
            val diff = target-num
            if(diff in map && i!=(map[diff]?:0))
              return intArrayOf(map[diff]!!,i)
            else
              map[num] = i
        }
        return IntArray(2)
    }
}
