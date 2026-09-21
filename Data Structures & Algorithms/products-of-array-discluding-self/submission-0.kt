class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
      var outputArray = IntArray(nums.size)
      var index =0
      var preIndex= 0
      var postIndex = 0
      var i =0
      while(i < nums.size){
        if(i == 0){
            var j = i+1
            var product = 1
            while(j < nums.size){
             product = product* nums[j]
             j++
            }
            outputArray[i] = product
        }else{
            preIndex = i-1
            postIndex = i+1
            var preOutput = 1
            var postOutput = 1
            while(preIndex >= 0){
              preOutput = preOutput*nums[preIndex]
              preIndex--
            }
            while(postIndex < nums.size){
                postOutput = postOutput*nums[postIndex]
                postIndex++
            }
            outputArray[i]=preOutput*postOutput
        }
         i++
      }
   return outputArray
    }
}
