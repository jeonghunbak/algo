class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = HashSet<Char>()
        var left = 0
        var maxLen = 0

        for (right in s.indices) {
            while (s[right] in set) {
                set.remove(s[left])
                left++
            }

            set.add(s[right])
            maxLen = maxOf(maxLen, set.size)
        }
        return maxLen
    }
}
