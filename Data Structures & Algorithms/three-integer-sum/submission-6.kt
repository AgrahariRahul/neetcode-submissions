class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val res = mutableSetOf<MutableList<Int>>()
        for((i,num)  in nums.withIndex()){
            if(num > 0)
             break
           var current = num
           var l = i+1
           var r = nums.lastIndex
           while(l < r){
            val sum = current+nums[l]+ nums[r]
            when{
                sum > 0 -> r--
                sum < 0 -> l++
                else -> {
                    res.add(mutableListOf(current,nums[l],nums[r]))
                    l++
                    r--
                }
            }
           }
        }
        return res.toList()
    }
}
