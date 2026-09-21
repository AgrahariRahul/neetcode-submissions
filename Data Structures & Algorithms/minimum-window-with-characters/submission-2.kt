class Solution {
    fun minWindow(s: String, t: String): String {
       if(t.isEmpty()) return ""
       val tmap = mutableMapOf<Char,Int>()
       for(ch in t){
        tmap[ch] = tmap.getOrDefault(ch,0)+1
       }
       var reslen = Int.MAX_VALUE
       var res = IntArray(2){-1}
       val need = tmap.size
       var have = 0
       var l = 0
       val windowMap = mutableMapOf<Char,Int>()
       for(r in s.indices){
         windowMap[s[r]] = windowMap.getOrDefault(s[r],0)+1
         if(s[r] in tmap && (windowMap[s[r]]?:0)==tmap[s[r]]){
            have++
         }
         while(have==need){
            if((r-l+1) < reslen){
                reslen = r-l+1
                res[0] = l
                res[1] = r
            }
            windowMap[s[l]] = windowMap.getOrDefault(s[l],0)-1
            if(s[l] in tmap && (windowMap[s[l]]?:0) < tmap[s[l]]!!){
                have--
            }
            l++
         }
        
       }
       return if(res[0]!=-1) s.substring(res[0],res[1]+1) else ""
    }
}
