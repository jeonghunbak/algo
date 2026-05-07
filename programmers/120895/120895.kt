class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        val arr = my_string.toCharArray()

        val temp = arr[num1]
        arr[num1] = arr[num2]
        arr[num2] = temp
        
        return String(arr)
    }
}
