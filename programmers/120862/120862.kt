class Solution {
    fun solution(numbers: IntArray): Int {
        numbers.sort()

        val front = numbers[0] * numbers[1]
        val back = numbers[numbers.size - 1] * numbers[numbers.size - 2]

        return maxOf(front, back)
    }
}
