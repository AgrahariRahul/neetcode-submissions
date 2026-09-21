class Solution {
    fun isValid(s: String): Boolean {
        //([{}])
        val map = mutableMapOf<Char,Char>(')' to '(', ']' to '[', '}' to '{')
        val stack = ArrayDeque<Char>()
        println("map : ${map.toString()}")
        for(ch in s){
            if(map.containsKey(ch)){
                if(stack.isEmpty().not() && stack.first() == map[ch]){
                    stack.removeFirst()
                }else{
                    return false
                }
            }else{
                stack.addFirst(ch)
            }
        }
        return stack.isEmpty()
    }
}
