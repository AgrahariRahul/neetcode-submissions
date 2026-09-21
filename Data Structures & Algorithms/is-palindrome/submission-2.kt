class Solution {
    fun isPalindrome(s: String): Boolean {
      var index = 0
      var right = s.lastIndex
      val stringBuilder = StringBuilder()
      val rightBuilder = StringBuilder() 
      while(index < s.length){
         if(s[index].isLetterOrDigit()){
            stringBuilder.append(s[index])
         }
         val endIndex = s.lastIndex-index
         if(s[endIndex].isLetterOrDigit()){
            rightBuilder.append(s[endIndex])
         }
         index++
      }
      println("${stringBuilder.toString().lowercase()} <> ${rightBuilder.toString().lowercase()}")
      return stringBuilder.toString().lowercase() == rightBuilder.toString().lowercase()
    }
}
