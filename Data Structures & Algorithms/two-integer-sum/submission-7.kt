class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       val mutableMap = mutableMapOf<Int,Int>()
       for((i,num) in nums.withIndex()){
        val diff = target-num
        if(mutableMap.containsKey(diff) && (mutableMap[diff]?:0)!=i){
            return intArrayOf(mutableMap[diff]!!,i)
        }
        mutableMap[num]=i
       }
       return IntArray(2)
    }
}
