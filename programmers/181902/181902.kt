class Solution {
    fun solution(my_string: String): IntArray {
        val answer = IntArray(52)

        for (ch in my_string) {
            if (ch in 'A'..'Z') {
                answer[ch - 'A']++
            } else {
                answer[ch - 'a' + 26]++
            }
        }

        return answer
    }
}
