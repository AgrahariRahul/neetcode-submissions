/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
      var current = root
      var count = k
      var mutableList = mutableListOf<TreeNode>()
      
      while(mutableList.isNotEmpty() || current!=null){
        while(current!=null){
            mutableList.add(current)
            current = current?.left
        }
            if(mutableList.isNotEmpty()){
            current = mutableList.removeLast()
            count--
            if(count==0){
                return current.`val`
            }
            }
        
        current = current?.right
      }
      return 0
    }
} 
