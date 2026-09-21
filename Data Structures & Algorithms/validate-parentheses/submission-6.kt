class Solution {
    fun isValid(s: String): Boolean {
     val map = mutableMapOf<Char,Char>(
        ')' to '(',
        '}' to '{',
        ']' to '['
     )
     val stack = ArrayDeque<Char>()
     for(ch in s){
        if(stack.isNotEmpty() && stack.getFirst()==map[ch]){
            stack.removeFirst()
        }else{
          stack.addFirst(ch)
        }
        
     }
     return stack.isEmpty()
    }
}
