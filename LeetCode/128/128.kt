class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toHashSet()
        var maxLen = 0

        for (num in set) {
            if(!set.contains(num - 1)){
                var curr = num
                var tempLen = 1

                while (set.contains(curr + 1)){
                    curr++
                    tempLen++
                }
                maxLen = maxOf(maxLen, tempLen)
            }
        }
        return maxLen
    }
}
