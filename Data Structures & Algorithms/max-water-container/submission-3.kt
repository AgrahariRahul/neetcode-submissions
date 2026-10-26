class Solution {
    fun maxArea(heights: IntArray): Int {
        var res = Int.MIN_VALUE
        var left = 0
        var right = heights.lastIndex

        while(left < right){
           var currentMin = minOf(heights[left],heights[right])
           var maxArea = (right-left)*currentMin
           res = maxOf(res,maxArea)
           if(heights[left] < heights[right]){
            left++
           }else{
            right--
           }
        }
        return res
        
    }
}
