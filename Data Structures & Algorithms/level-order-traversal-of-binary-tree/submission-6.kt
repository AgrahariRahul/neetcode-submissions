/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
          val res = mutableListOf<MutableList<Int>>()
        if(root==null) return res
    
      val stack = ArrayDeque<TreeNode>()
      stack.add(root)
      while(stack.isNotEmpty()){
        val size = stack.size
        val levelList = mutableListOf<Int>()
        for(i in 0 until size){
            val node = stack.removeFirst()
            levelList.add(node.`val`)
            node?.left?.let{stack.add(it)}
            node?.right?.let{stack.add(it)}
        }
        res.add(levelList)
      }
      //println("res: ${res.joinToString(",")}")
      return res
    }

}
