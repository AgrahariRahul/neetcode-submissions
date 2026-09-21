class Solution {
    fun isAnagram(s: String, t: String): Boolean {
         if(s.length != t.length){
            return false
         }
         val countArray = IntArray(26)
         val total = s.length-1
         for(index in 0..total){
            countArray[s[index]-'a']++
            countArray[t[index]-'a']-- 
         }
         for(value in countArray){
            if(value != 0)
            return false
         }
         println("result: ${countArray.joinToString(",")}")
         return true
    }
}
