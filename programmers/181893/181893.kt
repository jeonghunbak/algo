class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr

        for ((i, q) in query.withIndex()) {
            answer = if (i % 2 == 0) {
                answer.copyOfRange(0, q + 1)
            } else {
                answer.copyOfRange(q, answer.size)
            }
        }

        return answer
    }
}
