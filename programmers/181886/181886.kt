class Solution {
    fun solution(names: Array<String>): Array<String> {
        val answer = mutableListOf<String>()

        for (i in names.indices step 5) {
            answer.add(names[i])
        }

        return answer.toTypedArray()
    }
}
