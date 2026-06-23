class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        val sums = score.map { it[0] + it[1] }

        return sums.map { mySum ->
            sums.count { it > mySum } + 1
        }.toIntArray()
    }
}
