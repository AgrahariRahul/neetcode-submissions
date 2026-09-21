class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var mutableMap = mutableMapOf<Int,Int>()
        for(num in nums){
            mutableMap[num] = (mutableMap[num]?:0)+1
        }

        var bucketArray = Array<MutableList<Int>>(nums.size + 1){
            mutableListOf<Int>()
        }
        for((key,freq) in mutableMap){
            bucketArray[freq].add(key)
        }
        println("bucketArray is : ${bucketArray.toString()}")


         var result = mutableListOf<Int>()
        a@ for(i in bucketArray.lastIndex downTo 1){
             for(num in bucketArray[i]){
                 result.add(num)
                 if(result.size == k){
                    break@a
                  }
             }
        }
        println("result is : ${result.toString()}")
        return result.toIntArray()
    }
}
