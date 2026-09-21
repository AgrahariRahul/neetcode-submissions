class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
 nums.sort()
        val set = mutableSetOf<List<Int>>()
        for((i,num) in nums.withIndex()){
            if(num > 0) break
            val current = num
            var left = i+1
            var right = nums.lastIndex
            while(left < right){
                val sum = current+nums[left]+nums[right]
                when{
                    sum > 0 -> right--
                    sum < 0 -> left++
                    else ->{
                        set.add(listOf(current,nums[left],nums[right]))
                        left++
                        right--
                    }
                }
            }

        }
        return set.map{it.toList()}
 
    }
}
