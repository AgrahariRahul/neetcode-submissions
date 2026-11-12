class Solution {
    fun isPalindrome(s: String): Boolean {
       if(s.isEmpty()) return true
       var left = 0
       var right = s.lastIndex
       while(left < right){
          while(left < right && !s[left].isLetterOrDigit()){
            left++
          }

          while(right > left && !s[right].isLetterOrDigit()){
            right--
          }
          if(s[left].lowercase() != s[right].lowercase())
            return false
          left++
          right--  

       } 
       return true
    }
}
