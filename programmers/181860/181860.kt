class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        val x = mutableListOf<Int>()

        for (i in arr.indices) {
            if (flag[i]) {
                repeat(arr[i] * 2) {
                    x.add(arr[i])
                }
            } else {
                repeat(arr[i]) {
                    x.removeAt(x.lastIndex)
                }
            }
        }

        return x.toIntArray()
    }
}
