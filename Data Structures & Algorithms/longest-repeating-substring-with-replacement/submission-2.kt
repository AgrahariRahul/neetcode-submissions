class Solution {
    fun characterReplacement(s: String, k: Int): Int {
      var count = IntArray(26)
      var l = 0
      var maxFreq = 0
      var answer = 0
      for(r in s.indices){
        val index = s[r]-'A'
        count[index]++

        maxFreq = maxOf(maxFreq,count[index])
        var windowSize = r-l+1
        val replacement = windowSize-maxFreq
        if(replacement > k){
            count[s[l]-'A']--
            l++
        }
        answer = maxOf(answer,r-l+1) 
      }
      return answer
    }
}
