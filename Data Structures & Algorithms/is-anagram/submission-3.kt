class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length !=t.length)
          return false
       val mutableMap = mutableMapOf<Char,Int>()
       for(st in s){
        mutableMap[st]=mutableMap.getOrDefault(st,0)+1
       }
       for(tt in t){
        mutableMap[tt]=mutableMap.getOrDefault(tt,0)-1
       }

       for(value in mutableMap.values){
        if(value< 0){
            return false
        }
       }
       return true
    }
}
