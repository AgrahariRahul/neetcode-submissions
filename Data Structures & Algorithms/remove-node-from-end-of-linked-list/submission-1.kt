/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if(head==null) return null
        var total = 1
        var slow = head
        var fast = head
       // 1,2,3
        while(fast!=null){
            fast = fast?.next
            if(fast!=null)
              total++
        }
        println("total : $total")
        if(total==n) return head?.next
        
        val nodeIndex = (total-n)+1
        var startIndex = 1
        while(startIndex<nodeIndex-1){
            slow = slow?.next
            startIndex++
        }
        slow?.next = slow?.next?.next
        return head


    }
}
