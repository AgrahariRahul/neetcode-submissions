class Solution {
    fun isValid(s: String): Boolean {
      val map = mutableMapOf<Char,Char>(
        ']' to '[',
        '}' to '{',
        ')' to '('
      )

      var list = mutableListOf<Char>()
      for(ch in s){
        if(list.isNotEmpty() && list[list.size-1]==map[ch]){
            list.removeLast()
        }else{
            list.add(ch)
        }
      }
      return list.isEmpty()

    }
}
