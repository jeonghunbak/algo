class Solution {
    fun solution(A: String, B: String): Int {
         var str = A

        for (count in 0 until A.length) {
            if (str == B) return count

            // 마지막 문자를 맨 앞으로 이동
            str = str.last() + str.substring(0, str.length - 1)
        }

        return -1
    }
}
