class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
       val mutableMap = mutableMapOf<Int,Int>()
       for(num in nums){
        if(mutableMap.containsKey(num)){
           return true 
        }else{
           mutableMap[num] = (mutableMap[num]?:0)+1
        }
       }
       return false
    }
}
