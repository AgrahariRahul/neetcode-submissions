class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
      
      val mutableMap = mutableMapOf<String,MutableList<String>>()

      for(word in strs){
        var charFrq = IntArray(26)
        for(chr in word){
            charFrq[chr-'a']++
        }
        val key = charFrq.joinToString("#")
        mutableMap.getOrPut(key){mutableListOf()}.add(word)
      }

      println("result is: ${mutableMap.values.toList().toString()}")
      return mutableMap.values.toList()
    }
}
