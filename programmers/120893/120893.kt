class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        
        for (ch in my_string) {
            answer += if (ch.isLowerCase()) {
                ch.uppercaseChar()
            } else {
                ch.lowercaseChar()
            }
        }
        return answer
    }
}
