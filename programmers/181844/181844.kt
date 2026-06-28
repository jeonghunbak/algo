class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        val deleteSet = delete_list.toSet()
        return arr.filter { it !in deleteSet }.toIntArray()
    }
}
