class Solution {
    fun isValid(s: String): Boolean {
       val map = mutableMapOf<Char,Char>(
        ')' to '(',
        '}' to '{',
        ']' to '['
       )

       val stack = ArrayDeque<Char>()
       for(char in s){
         if(stack.isEmpty().not() && char in map && map[char]==stack.getLast()){
          stack.removeLast()
         }else{
          stack.addLast(char)
         }
       }
       return stack.isEmpty()
    }
}
