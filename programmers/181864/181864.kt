class Solution {
    fun solution(myString: String, pat: String): Int {
        val changed = myString.map { if (it == 'A') 'B' else 'A' }
            .joinToString("")

        return if (changed.contains(pat)) 1 else 0
    }
}
