import kotlin.math.abs

class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        return numlist
            .toList()
            .sortedWith(
                compareBy<Int> { abs(it - n) }
                    .thenByDescending { it }
            )
            .toIntArray()
    }
}
