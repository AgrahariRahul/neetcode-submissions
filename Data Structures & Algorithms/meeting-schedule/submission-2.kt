/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun canAttendMeetings(intervals: List<Interval>): Boolean {
        val sortedInterval = intervals.sortedBy{it.start}
        val list = PriorityQueue<Interval>()
        for(i in 1..sortedInterval.lastIndex){
           if(sortedInterval[i-1].end > sortedInterval[i].start) return false
        }
        return true
    }
}
