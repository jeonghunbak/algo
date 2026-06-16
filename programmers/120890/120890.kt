import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        return array.minWithOrNull(
            compareBy<Int> { abs(it - n) }
                .thenBy { it }
        )!!
    }
}
