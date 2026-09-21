class Solution {
    fun characterReplacement(s: String, k: Int): Int {
      val set = s.toSet()
      var res = 0
      for(char in set){
        var left = 0
        var count = 0
        for(index in s.indices){
          if(s[index]==char){
            count++
          }
          while((index-left+1)-count > k){
            if(s[left]==char){
                count--
            }
            left++
          }
          res = maxOf(res,index-left+1)
        }
      }
      return res
    }
}
