fun main() {
    val n = readln().toInt()
    val student = Array(n) { readln() }
    val correct = Array(n) { readln() }

    var answer = 0

    for (i in 0 until n) {
        if (student[i] == correct[i]) {
            answer++
        }
    }

    println(answer)
}
