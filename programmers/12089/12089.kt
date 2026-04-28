class Solution {
    fun solution(n: Int): IntArray {
        val answer = mutableListOf<Int>()

        for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                answer.add(i)

                if (i != n / i) {
                    answer.add(n / i)
                }
            }
        }
        return answer.sorted().toIntArray()
    }
}
