/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
 if(head == null) return null
        var slow = head
        var fast = head
        var totalCount = 1
        var slowCount = 1

        while(fast!=null){
          fast = fast?.next
          if(fast!=null)
            totalCount=totalCount+1
        }
        if(totalCount==n) return head?.next
        println("total: ${totalCount}")
        val removeNodeCount = (totalCount-n)+1
        while(slowCount < removeNodeCount-1){
            slow = slow?.next
            slowCount++

        }
        slow?.next = slow?.next?.next
        return head
    }
}
