class Solution {
    fun search(nums: IntArray, target: Int): Int {
      var left = 0
      var right = nums.lastIndex
      var res = -1
      while(left <= right){
        if(nums[left]==target){
            res = left
            break
        }
        if(nums[right]==target){
            res = right
            break
        }
        var mid = left+(right-left)/2
        if(nums[mid]==target){
            res = mid
            break
        }
        if(nums[mid] < nums[right]){
            if(target > nums[mid] && target < nums[right]){
              left = mid+1
            } else{
                right = mid-1
            }
        }else{
         if(target < nums[mid] && target > nums[left])  {
            right = mid-1
         } else{
            left = mid+1
         }
        }
      }
      return res
    }
}
