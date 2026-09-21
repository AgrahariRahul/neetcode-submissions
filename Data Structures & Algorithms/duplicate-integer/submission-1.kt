class Solution {
    fun hasDuplicate(num: IntArray): Boolean {
        num.sort()
        var hasDuplicate = false
        var i = 0
        var j = i+1
        while(j<num.size){
            if(num[i]==num[j]){
                hasDuplicate = true
                break;
            }
            j++
            i++
        }
        return hasDuplicate
        
    }
}