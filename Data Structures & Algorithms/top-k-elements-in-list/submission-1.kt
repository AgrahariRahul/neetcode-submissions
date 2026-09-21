class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var mutableMap = mutableMapOf<Int,Int>()

        for(num in nums){
            if(mutableMap.containsKey(num)){
                var count = mutableMap[num]!!
                mutableMap[num] = count+1
            }else{
                 mutableMap[num] = 1
            }
        }
          println("result map is: ${mutableMap.toString()}")

      val resultMap =  mutableMap.toList().sortedBy{(_,value)->value}.takeLast(k).toMap()
      println("result is: ${resultMap.keys.toIntArray().joinToString(",")}")
      return resultMap.keys.toIntArray()
    }
}
