class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
       var prefix = 1
       var prefixProdArray = IntArray(nums.size)
       var suffix = 1
       var suffixProdArray = IntArray(nums.size)
       for(i in nums.indices){
          if(i-1 <  0){
           prefixProdArray[i] = prefix
          }else{
            prefix = prefix*nums[i-1]
            prefixProdArray[i] = prefix
          }
       }

       for(i in nums.lastIndex downTo 0){
         if(i+1 == nums.size){
          suffixProdArray[i] = suffix
         }else{
           suffix = suffix*nums[i+1]
           suffixProdArray[i]=suffix
         }
       }
       println("Result is: prefixProd: ${prefixProdArray.joinToString(", ")}")
       println("Result is: suffixProd: ${suffixProdArray.joinToString(", ")}")
       var outputArray = IntArray(nums.size)
       for(i in nums.indices){
        outputArray[i] = prefixProdArray[i]*suffixProdArray[i]
       }
       println("Final Result is: ${outputArray.joinToString(", ")}")
       return outputArray
    }
}
