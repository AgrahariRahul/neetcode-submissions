class Solution {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
      val sortedIntervals = intervals.sortedBy({it[0]})
      var maxEnd = sortedIntervals[0][1]
      var remove = 0
      for(index in 1..sortedIntervals.lastIndex){
    
        if(maxEnd > sortedIntervals[index][0]){
            remove++
           maxEnd = minOf(maxEnd,sortedIntervals[index][1])
           
        }else{
          maxEnd = sortedIntervals[index][1]
        }
        
      }
      return remove
    }
}
