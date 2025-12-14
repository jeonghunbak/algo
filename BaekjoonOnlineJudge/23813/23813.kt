// 123 -> 312 -> 231 
// 숫자는 모든 자릿값에 한 번씩 등장
// 1 + 2 + 3 을 모든 자리에 넣어주면 정답

fun main(){
    var input = readln()
    val sum = input.sumOf { it - '0' }
    val ones = "1".repeat(input.length).toLong()
    println(sum * ones)
}
