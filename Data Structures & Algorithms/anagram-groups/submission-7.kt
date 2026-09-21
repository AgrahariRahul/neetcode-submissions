class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
       val mutableMap = mutableMapOf<String,MutableList<String>>()
       for(str in strs){
        val charArray = IntArray(26){0}
        for(char in str){
          charArray[char-'a']++
        }
        val key = charArray.joinToString("#")
        mutableMap[key] = mutableMap.getOrDefault(key,mutableListOf<String>()).apply{
            add(str)
        }
       }
       return mutableMap.values.toList()

    }
}
