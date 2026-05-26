class Solution {
    fun solution(n: Int): Int {
         var answer = 0

        for (i in 1..n) {
            if (n % 2 == 1 && i % 2 == 1) {
                answer += i
            }

            if (n % 2 == 0 && i % 2 == 0) {
                answer += i * i
            }
        }

        return answer
    }
}
