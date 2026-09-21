class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var mutableMap = mutableMapOf<Int, Int>()
        for(num in nums){
            if(mutableMap.containsKey(num)){
                return true
            }else{
                mutableMap[num] = num
            }
        }
        return false
    }
}
