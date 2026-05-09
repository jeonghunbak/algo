class Solution {
    fun solution(num_list: IntArray): Int {
        var oddSum = 0
        var evenSum = 0

        num_list.forEachIndexed { index, value ->
            if (index % 2 == 0) oddSum += value
            else evenSum += value
        }

        return maxOf(oddSum, evenSum)
    }
}
