class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        
        val map = mutableMapOf<Char,Int>()
        for(ch in s){
            map[ch] = map.getOrDefault(ch,0)+1
        }

        for(ch in t){
            map[ch] = map.getOrDefault(ch,0)-1
        }

        for(value in map.values){
            if(value !=0)
             return false
        }
        return true
         
    }
}
