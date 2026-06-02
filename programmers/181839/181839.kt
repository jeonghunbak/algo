class Solution {
    fun solution(a: Int, b: Int): Int {
        val aOdd = a % 2 == 1
        val bOdd = b % 2 == 1

        return when {
            aOdd && bOdd -> a * a + b * b
            aOdd != bOdd -> 2 * (a + b)
            else -> if (a > b) a - b else b - a
        }
    }
}
