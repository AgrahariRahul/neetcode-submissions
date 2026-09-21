class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
      val list = mutableListOf<Int>()
      for(num in nums){
        val pos = findLowerPosition(list,num)
        if(pos==list.size){
          list.add(num)
        }else{
          list[pos]=num
        }
      }
      return list.size
    }

    private fun findLowerPosition(list:List<Int>, target:Int):Int{
      var low = 0
      var end = list.size
      while(low < end){
        var mid = (low+end)/2
        if(list[mid ]< target){
          low = mid+1
        }else{
          end = mid
        }
      }
      return low
    }


}
