class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
       val sortedIntervals = intervals.sortedBy({it[0]})
       val res = mutableListOf<IntArray>()
       for(interval in sortedIntervals){
          if(res.isNotEmpty() && res.last()[1] >= interval[0]){
            res.last()[1] = maxOf(res.last()[1],interval[1])
          }else{
            res.add(interval)
          }
       }
       return res.toTypedArray()
    }
}
