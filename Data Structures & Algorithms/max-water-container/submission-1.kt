class Solution {
    fun maxArea(height: IntArray): Int {
 var res = Int.MIN_VALUE
        var left = 0
        var right= height.lastIndex
        
        while(left < right){
            val area = minOf(height[left],height[right])*(right-left)
            res = maxOf(res,area)
            if(height[left] < height[right]){
                left++
            }else {
                right--
            }
        }
        return res
    }
}
