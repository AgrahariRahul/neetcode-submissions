class Solution {
  
    fun twoSum(array: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int,Int>()
        for(i in array.indices){
            val rem = target-array[i]
            if(map.containsKey(rem)){
                return intArrayOf(map[rem]!!,i)
            }
            map[array[i]]=i
        }
       return IntArray(2)
    }
}
