class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { query ->
            for (i in query[0]..query[1]) {
                arr[i]++
            }
        }
        return arr
    }
}
