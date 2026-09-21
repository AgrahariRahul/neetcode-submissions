/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
  val dummyNode:ListNode = ListNode(0)
      var mergeHead: ListNode? = dummyNode
      var l1 = list1
      var l2 = list2
      while(l1!= null && l2!=null){
        if(l1.`val` <= l2.`val`){
            mergeHead?.next = l1
            l1 = l1.next
        }else{
            mergeHead?.next = l2
            l2 = l2.next
        }
        mergeHead = mergeHead?.next
      }
       mergeHead?.next = l1?:l2
       return dummyNode.next
    }
}
