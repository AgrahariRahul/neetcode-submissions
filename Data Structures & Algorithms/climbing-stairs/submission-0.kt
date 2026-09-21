class Solution {
    fun climbStairs(n: Int): Int {
       if(n<=2) return n
       var prev1 = 1
       var prev2 = 2
       for(i in 3..n){
        var cur = prev1+prev2
        prev1 = prev2
        prev2 = cur
       }
       return prev2
    }
}
