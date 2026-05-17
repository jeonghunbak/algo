class Solution {
    fun solution(n: Int): IntArray {
        val answer = mutableListOf<Int>()
        var x = n

        while (true) {
            answer.add(x)

            if (x == 1) break

            x = if (x % 2 == 0) x / 2 else 3 * x + 1
        }

        return answer.toIntArray()
    }
}
