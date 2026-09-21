/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
       return isValid(root,null, null)
    }

    fun isValid(root:TreeNode?, left: Int?,right:Int?):Boolean{
        if(root==null) return true
        val rootValue = root.`val`
        if((left!=null && rootValue <=left) || (right !=null && rootValue >=right)) return false
        return isValid(root?.left,left,rootValue) && isValid(root?.right,rootValue,right)
    }
}
