class Solution {
    fun solution(box: IntArray, n: Int): Int {
        val (width, length, height) = box
        
        val x = width / n
        val y = length / n
        val z = height / n
        
        return x * y * z
    }
}
