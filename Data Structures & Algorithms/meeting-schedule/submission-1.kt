/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun canAttendMeetings(intervals: List<Interval>): Boolean {
       val sortedIntervals = intervals.sortedBy({it.start})
       var heap = PriorityQueue<Interval>(compareBy{it.end})
       for(interval in sortedIntervals){
        if(heap.isNotEmpty() && heap.peek().end <= interval.start){
            heap.poll()
        }
        heap.offer(interval)
        if(heap.size > 1){
          return false
        }
       }
       return true
    }
}
