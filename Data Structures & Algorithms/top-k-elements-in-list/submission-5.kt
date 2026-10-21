class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
       val map = mutableMapOf<Int,Int>()
       var res = mutableListOf<Int>()
       for(num in nums){
        map[num]= map.getOrDefault(num,0)+1
       }
       val array = Array<MutableList<Int>>(nums.size+1){mutableListOf<Int>()}

       for((key,value) in map.entries){
          array[value].add(key)
       }

       for(index in array.lastIndex downTo 0){
        for(item in array[index]){
            res.add(item)
            if(res.size==k)
             return res.toIntArray()
           
        }

       }
       return intArrayOf() 
    }
}
