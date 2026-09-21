class Solution {
    fun minWindow(s: String, t: String): String {
     if(t.isEmpty()){
        return ""
     }
      val mapT = mutableMapOf<Char,Int>()
      for(char in t){
        mapT[char] = mapT.getOrDefault(char,0)+1
      }
      val resArray = IntArray(2){-1}
      val windowMap = mutableMapOf<Char,Int>()
      var resLen = Int.MAX_VALUE
      val need = mapT.size
      var have = 0
      var left = 0
      for(r in s.indices){
       windowMap[s[r]] = windowMap.getOrDefault(s[r],0)+1
       if(s[r] in mapT && windowMap[s[r]]==mapT[s[r]]){
        have++
       }
       while(have == need){
        if(r-left+1 < resLen){
            resArray[0]=left
            resArray[1]=r
            resLen = r-left+1
        }
        windowMap[s[left]] = windowMap.getOrDefault(s[left],0)-1
        if(s[left] in mapT && ((windowMap[s[left]]?:0)<mapT[s[left]]!!)){
            have--
        }
        left++
       }
      }
      return if(resArray[0] > -1) s.substring(resArray[0],resArray[1]+1) else ""
    }
}
