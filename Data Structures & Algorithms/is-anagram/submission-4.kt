class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length !=t.length){
          return false
        }

        val mutableMap = mutableMapOf<Char,Int>()
        for(index in s.indices){
          mutableMap[s[index]] = mutableMap.getOrDefault(s[index],0)+1
          mutableMap[t[index]] = mutableMap.getOrDefault(t[index],0)-1
        }
       
       for (value in mutableMap.values){
        if(value !=0)
            return false
       }
       return true
    }
}
