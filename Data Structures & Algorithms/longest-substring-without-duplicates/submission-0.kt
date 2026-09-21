class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
      var set = mutableSetOf<Char>()
      var l = 0
      var r = 0
      var maxLength = 0
      for(r in s.indices){
         while(s[r] in set){
            set.remove(s[l])
            l++
         }
         maxLength = maxOf(maxLength, r-l+1)
         set.add(s[r]) 
      }
      return maxLength
    }
}
