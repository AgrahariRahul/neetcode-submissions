class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
      val set = mutableSetOf<Char>()
      var left = 0
      var res = 0
      for(right in s.indices){
        while(s[right] in set){
          set.remove(s[left])
          left++
        }
        set.add(s[right])
        res = maxOf(res,right-left+1)
      }
      return res
    }
}
