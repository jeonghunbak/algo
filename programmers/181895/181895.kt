class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        val first = arr.sliceArray(intervals[0][0]..intervals[0][1])
        val second = arr.sliceArray(intervals[1][0]..intervals[1][1])

        return first + second
    }
}
