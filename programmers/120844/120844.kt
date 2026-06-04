class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        return if (direction == "right") {
            (numbers.takeLast(1) + numbers.dropLast(1)).toIntArray()
        } else {
            (numbers.drop(1) + numbers.take(1)).toIntArray()
        }
    }
}
