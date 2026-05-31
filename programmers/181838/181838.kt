class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        val d1 = date1[0] * 10000 + date1[1] * 100 + date1[2]
        val d2 = date2[0] * 10000 + date2[1] * 100 + date2[2]

        return if (d1 < d2) 1 else 0
    }
}
