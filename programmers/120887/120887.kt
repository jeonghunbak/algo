class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        val target = k.toString()[0]

        return (i..j).sumOf { num ->
            num.toString().count { it == target }
        }
    }
}
