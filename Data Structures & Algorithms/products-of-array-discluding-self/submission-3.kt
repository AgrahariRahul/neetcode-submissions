class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
  var prefix = 0
        var suffix = 0
        val preArray= IntArray(nums.size)
        val postArray = IntArray(nums.size)

        for((i,num) in nums.withIndex()){
            if(i-1 < 0){
                preArray[i] = 1
                prefix = preArray[i]
            }else{
                 preArray[i] = nums[i-1]*prefix 
                 prefix = preArray[i]
            }
        }

        for(i in nums.lastIndex downTo 0){
            if(i+1==nums.size){
               postArray[i] = 1
               suffix = postArray[i]
            }else{
                postArray[i] = nums[i+1]*suffix
                suffix = postArray[i]
            }
        }

        for(i in preArray.indices){
         postArray[i] = postArray[i]*preArray[i]
        }
        return postArray

    }
}
