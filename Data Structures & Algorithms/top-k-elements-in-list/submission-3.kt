class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
       val mutableMap = mutableMapOf<Int,Int>()
       for(num in nums){
        mutableMap[num]=mutableMap.getOrPut(num){0}+1
       }

       val bucketArray = Array<MutableList<Int>>(nums.size+1){mutableListOf()}
       for((key,value) in mutableMap){
         bucketArray[value].add(key)
       }
       val res = mutableListOf<Int>()
       a@ for(index in bucketArray.lastIndex downTo 1){
          for(i in bucketArray[index]){
            res.add(i)
            if(res.size==k)
            break@a
          }
       }
       return res.toIntArray()
    }
}
