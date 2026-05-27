class Solution {
    fun solution(my_string: String): String {
        val seen = mutableSetOf<Char>()
        val answer = StringBuilder()
    
        for (ch in my_string) {
            if (ch !in seen) {
                seen.add(ch)
                answer.append(ch)
            }
        }
    
        return answer.toString()
    }
}
