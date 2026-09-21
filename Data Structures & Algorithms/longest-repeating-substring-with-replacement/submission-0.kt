class Solution {
    fun characterReplacement(s: String, k: Int): Int {
      var res = 0
      var set = s.toSet()
     
      for(char in set){
        var count = 0
        var l = 0
        for(r in s.indices){
            if(s[r]==char){
                count++
            }
            while((r-l+1)-count > k){
                if(s[l]==char){
                    count--
                }
                l++
            }
            res = maxOf(res,r-l+1)
        }

      }
      return res
    }
}
