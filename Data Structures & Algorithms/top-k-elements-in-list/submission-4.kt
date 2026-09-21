class Solution {
 
fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val mutableMap = mutableMapOf<Int,Int>()
        for(num in nums){
            mutableMap[num] = mutableMap.getOrDefault(num,0)+1
        }

        val bucketArray = Array<MutableList<Int>>(nums.size+1){mutableListOf<Int>()}
        for((key,value) in mutableMap){
            bucketArray[value].add(key)
        }
        val res = mutableListOf<Int>()
        for(bucketIndex in bucketArray.lastIndex downTo 0){
            for(item in bucketArray[bucketIndex]){
                  res.add(item)
                  if(res.size==k)
                  return res.toIntArray()
            }
        }
        return IntArray(k)
    }
    
}
