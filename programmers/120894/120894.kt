class Solution {
    fun solution(numbers: String): Long {
        val words = arrayOf(
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        )

        var result = numbers

        words.forEachIndexed { index, word ->
            result = result.replace(word, index.toString())
        }

        return result.toLong()
    }
}
