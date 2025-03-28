/*
    5kg을 최대한 많이 써야하는 문제
    5 로 나누어떨어지지 않을 경우 3을 사용하여 5로 나누어 떨어질때까지 반복
    3키로씩 계속 빼주며 5로 나누어지지 않을 경우 중지
*/

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
