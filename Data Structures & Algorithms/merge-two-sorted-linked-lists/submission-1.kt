/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
       var dummyNode: ListNode? =  ListNode(0)
       var mergeList:ListNode? = dummyNode
       var l1 = list1
       var l2 = list2

       while(l1!=null && l2!=null){
          if(l1.`val` <= l2.`val`){
            mergeList?.next = l1
            l1 = l1.next
          }else{
             mergeList?.next = l2
             l2 = l2.next
          }
          mergeList = mergeList?.next
       }
       if(l1!=null){
        mergeList?.next = l1
       }else{
         mergeList?.next = l2
       }
       return dummyNode?.next
    }
}
