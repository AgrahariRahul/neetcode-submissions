class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
      val res = mutableSetOf<List<Int>>()
      nums.sort()
      println("sorted array: ${nums.toString()}")
      for(i in nums.indices){
        val a = nums[i]
        if(a > 0) break
        var l = i+1
        var r = nums.lastIndex
        while( l < r){
            val sum = a+nums[l]+nums[r]
            when{
                sum > 0 -> r--
                sum < 0 -> l++
                else -> {
                    res.add(listOf(a,nums[l],nums[r]))
                    l++
                    r--
                }
            }
        }
      }
      println("result array: ${res.toString()}}")
      return res.map{it.toList()}
    }
}
