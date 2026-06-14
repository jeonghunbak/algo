class Solution {
    fun solution(array: IntArray): Int {
        return array.sumOf { number ->
            number.toString().count { it == '7' }
        }
    }
}
