class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        val removeSet = indices.toSet()
        val answer = StringBuilder()

        for (i in my_string.indices) {
            if (i in removeSet) continue
            answer.append(my_string[i])
        }

        return answer.toString()
    }
}
