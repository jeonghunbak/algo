fun main(){
    val cnt = readln().toInt()

    repeat(cnt){ index ->
        val numbers = readln().split(" ").map { it.toInt() }.sorted()
        var answer = "NO"

        if(numbers.size == 3) {
            val a = numbers[0] * numbers[0]
            val b = numbers[1] * numbers[1]
            val c = numbers[2] * numbers[2]

            if (a + b == c) answer = "YES"
        }
        println("Case #${index + 1}: $answer")
    }
}
