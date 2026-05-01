class Solution {
    fun solution(num: Int, k: Int): Int {
        val idx = num.toString().indexOf(k.toString())
        return if (idx == -1) -1 else idx + 1
    }
}
