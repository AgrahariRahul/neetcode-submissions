/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
       if(root==null && subRoot==null) return true
       val stack = ArrayDeque<TreeNode>()
       stack.addFirst(root)
    
       while(stack.isNotEmpty()){
        val node = stack.removeLast()
        if(node?.`val` == subRoot?.`val` && sameTree(node,subRoot)){
           return true
        }
          node?.left?.let{stack.addLast(it)}
          node?.right?.let{stack.addLast(it)}
       }
       return false
    }

    fun sameTree(p: TreeNode?, q: TreeNode?):Boolean{
        if(p==null && q== null) return true
        if(p==null || q==null || p?.`val` != q.`val`) return false
        val pairQ = ArrayDeque<Pair<TreeNode?,TreeNode?>>()
        pairQ.addFirst(Pair(p,q))
        while(pairQ.isNotEmpty()){
            val (first,second) = pairQ.removeLast()
            if(first==null && second==null) continue
            if(first ==null || second ==null || first.`val` != second.`val`) return false
            pairQ.addLast(Pair(first?.left,second?.left))
            pairQ.addLast(Pair(first?.right,second?.right))
        }
        return true
    }
}
