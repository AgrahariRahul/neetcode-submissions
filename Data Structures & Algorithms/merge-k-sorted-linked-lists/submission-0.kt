/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if(lists.isEmpty()) return null

        var mergeResult = lists[0]
       for(i in 1..lists.lastIndex){
        mergeResult = mergeTwoList(mergeResult,lists[i])
       }
       return mergeResult
    }

    fun mergeTwoList(list1:ListNode?,list2: ListNode?):ListNode?{
        var l1 = list1
        var l2 = list2
        var dummy = ListNode(0)
        var merge:ListNode? = dummy
        while(l1!=null && l2!=null){
            if(l1.`val` < l2.`val`){
               merge?.next=l1
               l1=l1.next
               merge = merge?.next
            }else{
                merge?.next=l2
                l2 =l2.next
                merge = merge?.next
            }
        }
        merge?.next = l1?:l2
        return dummy?.next
    }
}
