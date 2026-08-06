class Solution {
    fun firstUniqChar(s: String): Int {
        val arr = IntArray(26)
        
        for (ch in s) {
            arr[ch - 'a']++
        }

         for ((idx, ch) in s.withIndex()) {
            if (arr[ch - 'a'] == 1) {
                return idx
            }
        }
        return -1
    }
}
