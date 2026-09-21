/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if(p==null && q==null) return true
        
        val queue = ArrayDeque<Pair<TreeNode?,TreeNode?>>()
        queue.addLast(Pair(p,q))
        while(queue.isNotEmpty()){
            val (first,second) = queue.removeLast()
            if(first==null && second==null) continue
            if(first == null || second == null || first.`val`!= second.`val`){
                return false
            }
            queue.add(Pair(first.left,second.left))
            queue.add(Pair(first.right,second.right))
        }
        return true

    }
}
