class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var  i = 0
        var j  = 0

        val resultArray = IntArray(2)
        var isSum = false
  //4,5,6
        while(i < nums.size){
            j = i+1
            while(i < nums.size && j<nums.size){
                if(nums[i]+nums[j]==target){
                    resultArray[0] = i
                    resultArray[1] = j
                    break
                }
                j++
            }
            i++

        }

     return resultArray
    }
}
