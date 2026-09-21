/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
      if(lists.isEmpty()) return null
      val minHeap = PriorityQueue<ListNode>(
        compareBy{it.`val`}
      )
      for(list in lists){
        if(list!=null)
          minHeap.offer(list)
      }

      var dummy = ListNode(0)
      var res:ListNode? = dummy
      while(minHeap.isNotEmpty()){
        val node = minHeap.poll()
        res?.next = node
        res = res?.next
        
        node?.next?.let{
            minHeap.offer(it)
        }
      } 
      return dummy?.next
    }
}
