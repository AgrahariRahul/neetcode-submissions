class Solution {
    fun rob(nums: IntArray): Int {
       if(nums.isEmpty()) return 0
       if(nums.size==1) return nums[0]
       
       val case1 = robCase(nums,0,nums.lastIndex-1)
       val case2 = robCase(nums,1,nums.lastIndex)
       return maxOf(case1,case2)
    }

    private fun robCase(array: IntArray,start:Int, end:Int):Int{
        var prev1 = 0
        var prev2 = 0
        for(i in start..end){
            val current = maxOf(prev1,array[i]+prev2)
            prev2=prev1
            prev1=current
        }
        return prev1
    }
}
