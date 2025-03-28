import kotlin.math.ceil

/*
달팽이는 결국 (막대의 높이 - 낮에 올라가는 높이) 이상 까지만 도달하면 다음 날 정상에 도달할 수 있습니다. 

그렇다면 저 위치에 도달하기 전까지는 올라가도 항상 밤에 미끄러지므로, 하루마다 올라가는 높이는 (낮에 올라가는 높이 - 밤에 미끄러지는 높이)가 되겠죠.

날짜 계산은 올림((다음날 정상에 도달하기 위한 최소 높이) / (하루마다 올라가는 높이)) + 하루가 더 필요하므로 어렵지 않게 구할 수 있습니다.
*/

fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val a = input[0]
    val b = input[1]
    val v = input[2]
    val answer = ceil(((v - a).toDouble() / (a - b)) + 1).toInt()

    print(answer)
}
