class Solution {
    fun maxArea(heights: IntArray): Int {
       var left = 0
       var right = heights.lastIndex
       var maxArea = Int.MIN_VALUE
       while(left < right){
        val min = minOf(heights[left],heights[right])
        maxArea = maxOf(maxArea,(right-left)*min)
        if(heights[left] < heights[right]){
            left++
        }else{
            right--
        }
       }

       return maxArea
    }
}
