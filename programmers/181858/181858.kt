class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        return (arr.distinct().take(k) + List(k) { -1 })
            .take(k)
            .toIntArray()
    }
}
