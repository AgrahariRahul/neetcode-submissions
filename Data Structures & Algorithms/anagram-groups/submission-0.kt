class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

         var mutableMap = mutableMapOf<String,MutableList<String>>()
         for(i in strs.indices){
            var item = strs[i].toCharArray().sorted().joinToString("")
            if(mutableMap.containsKey(item)){
                var list = mutableMap[item]!!
                list.add(strs[i])
                mutableMap[item] = list
            }else{
                mutableMap[item] = mutableListOf(strs[i])
            }
         }

         var results = mutableListOf<List<String>>()
         for(value in mutableMap.values){
            results.add(value)
         }
         println("Result is <> ${results.toString()}")
         return results
    }
}
