/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun minMeetingRooms(intervals: List<Interval>): Int {
      val sortedIntervals = intervals.sortedBy({it.start})
      var heap = PriorityQueue<Interval>(compareBy{it.end})
      for(interval in sortedIntervals){
        if(heap.isNotEmpty() && heap.peek().end <= interval.start){
          heap.poll()
        }
        heap.offer(interval)
      }
      return heap.size
    }
}
