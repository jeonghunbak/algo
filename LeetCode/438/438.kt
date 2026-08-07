class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        if (p.length > s.length) return emptyList()
        
        val answer = mutableListOf<Int>()
        val pCnt = IntArray(26)
        val wCnt = IntArray(26)
        

        for (i in p.indices) {
            pCnt[p[i] - 'a']++
            wCnt[s[i] - 'a']++
        }

        if (pCnt.contentEquals(wCnt)) {
            answer.add(0)
        }

        for (right in p.length until s.length) {
            val left = right - p.length

            wCnt[s[left] - 'a']--
            wCnt[s[right] - 'a']++

            if (pCnt.contentEquals(wCnt)) {
                answer.add(left + 1)
            }
        }

        return answer
    }
}
