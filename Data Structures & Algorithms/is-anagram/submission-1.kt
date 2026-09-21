class Solution {
    fun isAnagram(s: String, t: String): Boolean {
         if(s.length != t.length){
            return false
         }else{
            val map = mutableMapOf<Char,Int>()
            val slength= s.length-1
            for(i in 0..slength){
                map[s[i]] = if(s[i] in map){
                    val key = s[i]
                    val value = map[key]?:0
                    value+1
                }else{
                    1
                }
            }

            val tmap = mutableMapOf<Char,Int>()
               val tlength = t.length-1
               for(i in 0..tlength){
                tmap[t[i]] = if(t[i] in tmap){
                    val key = t[i]
                    val value = tmap[key]?:0
                    value+1
                }else{
                    1
                }
            }
            
            var isAnagram = true
            for(key in map.keys){
                if(key in tmap && map[key] == tmap[key]){
                   
                }else{
                    isAnagram = false
                    break
                }
            }
            return isAnagram

 

         }
    }
}
