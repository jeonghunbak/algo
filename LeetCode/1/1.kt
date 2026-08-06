class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val num = nums[i]
            val need = target - num

            if(map.containsKey(need)) {
                return intArrayOf(map[need]!!, i)
            }

            map[num] = i
        }
        return intArrayOf()
    }
}
