/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
       if(head == null) return
       var slow = head
       var fast = head
       while(fast?.next!=null){
        slow = slow?.next
        fast = fast?.next?.next
       }
       // break list into half
       var prev: ListNode? = null
       var current = slow?.next
       slow?.next = null
       while(current!=null){
        val next = current?.next
        current?.next = prev
        prev = current
        current = next
       }
       var first = head
       var second = prev
       while(second!=null){
        var temp1 = first?.next
        var temp2 = second?.next
        first?.next = second
        second?.next = temp1
        first = temp1
        second = temp2
       }
    }
}
