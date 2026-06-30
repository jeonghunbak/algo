class Solution {
    fun solution(order: Array<String>): Int {
        return order.sumOf { menu ->
            when {
                menu.contains("americano") -> 4500
                menu.contains("cafelatte") -> 5000
                else -> 4500
            }
        }
    }
}
