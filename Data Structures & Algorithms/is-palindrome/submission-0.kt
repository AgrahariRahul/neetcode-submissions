class Solution {
    fun isPalindrome(s: String): Boolean {
       var newString = s.filterNot{it.isWhitespace()}.lowercase().filter{it.isLetterOrDigit()}
       println("newString : ${newString}")
        var reverseString = ""
       for(i in newString.lastIndex downTo 0){
          reverseString = reverseString+newString[i]
       }
       println("reversString: ${reverseString}")
       return newString==reverseString
    }
}
