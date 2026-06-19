class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        return quiz.map {
            val parts = it.split(" ")

            val x = parts[0].toInt()
            val op = parts[1]
            val y = parts[2].toInt()
            val z = parts[4].toInt()

            val result = if (op == "+") x + y else x - y

            if (result == z) "O" else "X"
        }.toTypedArray()
    }
}
