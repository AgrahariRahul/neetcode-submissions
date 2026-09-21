class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var map = mutableMapOf<String,MutableList<String>>()
       for(str in strs){
         val sortedKey = IntArray(26)
          for(s in str){
            println("mapKey value : ${sortedKey[s-'a']}")
            sortedKey[s-'a'] = sortedKey[s-'a']+1
             println("mapKey value after: ${sortedKey[s-'a']}")
          }
          val mapKey = sortedKey.joinToString("#")
          println("mapKey is : $mapKey")
           
          map.getOrPut(mapKey){mutableListOf()}.add(str)
       }
      println("result is : ${map.toString()}")
       return map.values.toList()
    }
}
