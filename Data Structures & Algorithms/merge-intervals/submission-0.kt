class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
 val sorted = intervals.sortedBy { it[0] }
    val result = mutableListOf<IntArray>()

    for (interval in sorted) {
        if (result.isNotEmpty() && result.last()[1] >= interval[0]) {
            // Overlaps with the last merged interval — extend its end
            result.last()[1] = maxOf(result.last()[1], interval[1])
        } else {
            result.add(interval)
        }
    }
    return result.toTypedArray()
    }
}
