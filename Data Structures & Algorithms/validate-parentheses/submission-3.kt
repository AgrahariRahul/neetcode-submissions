class Solution {
    fun isValid(s: String): Boolean {
      val map = mutableMapOf<Char,Char>(
        ')' to '(',
         '}' to '{',
         ']' to '['
      )
      val stack = ArrayDeque<Char>()
      for(char in s){
        if(char in map){
            if(stack.isNotEmpty() && stack.first()==map[char]){
             stack.removeFirst()
             println("remove in stack ${char}")
            }else{
                return false
            }
        }else{
         stack.addFirst(char)
         println("add in stack ${char}")
        }
      }
      return stack.isEmpty()
    }
}
