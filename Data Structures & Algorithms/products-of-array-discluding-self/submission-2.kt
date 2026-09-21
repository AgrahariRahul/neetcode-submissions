class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
val preOutputArray = IntArray(nums.size)
        val postOutputArray = IntArray(nums.size)
        val resArray = IntArray(nums.size)

        var prefix = 1
        var postfix = 1
        for(i in nums.indices){
           if(i-1<0){
                preOutputArray[i] = prefix
           }else{
            preOutputArray[i] = prefix*nums[i-1]
            prefix = preOutputArray[i]
           }   
        }

        for(i in nums.lastIndex downTo 0){
           if(i+1==nums.size){
                postOutputArray[i] = postfix
           }else{
            postOutputArray[i] = postfix*nums[i+1]
            postfix = postOutputArray[i]
           }   
        }
        for(i in resArray.indices){
            resArray[i] = preOutputArray[i] * postOutputArray[i]
        }
        return resArray
        
    }
}
