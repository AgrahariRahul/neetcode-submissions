/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
      var prevNode: ListNode? =  null
      var current: ListNode? = head
      //1,2,3,4
      while(current!=null){
        val nextNode = current.next
        //nextNode-> 2,3,4
        //1-> null

        current.next = prevNode
        //prev 1
        //current = 2,3,4
        prevNode = current
        current = nextNode
      }
      return prevNode
    }
}
