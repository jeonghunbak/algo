class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = HashMap<Char, Char>()
        val used = HashSet<Char>()

        for (i in s.indices) {
            val sChar = s[i]
            val tChar = t[i]
            
            if(map.containsKey(sChar)) {
                if(map[sChar] != tChar) return false
            } else {
                if (tChar in used) return false

                map[sChar] = tChar
                used.add(tChar)
            }
        }
        return true
    }
}
