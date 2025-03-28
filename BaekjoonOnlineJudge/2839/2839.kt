fun main() {
    var input = readln().toInt()
    var answer = 0

    while(input > 0){
        if (input % 5 == 0) {
            answer += input / 5
            break
        } else {
            answer++
            input -= 3
        }
    }

    print(if (input % 5 == 0) answer else -1)
}
