class Solution {
    fun frequencySort(s: String): String {
        val map = HashMap<Char, Int>()

        for(ch in s) {
            map[ch] = map.getOrDefault(ch, 0) + 1
        }

        return map.entries
            .sortedByDescending { it.value }
            .joinToString("") { (ch, count) ->
                ch.toString().repeat(count)
            }
    }
}
