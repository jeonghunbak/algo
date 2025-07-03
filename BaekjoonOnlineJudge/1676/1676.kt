fun main() {
    val cnt = readln().toInt()
    var answer = 0
    var divider = 5

    while (divider <= cnt){
        answer += cnt / divider
        divider *= 5
    }
    print(answer)
}
