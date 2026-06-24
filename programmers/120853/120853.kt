class Solution {
    fun solution(s: String): Int {
        val stack = mutableListOf<Int>()

        for (token in s.split(" ")) {
            if (token == "Z") {
                stack.removeAt(stack.lastIndex)
            } else {
                stack.add(token.toInt())
            }
        }

        return stack.sum()
    }
}
