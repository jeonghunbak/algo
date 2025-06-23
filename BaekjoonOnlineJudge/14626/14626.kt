fun main() {
    val input = readln()
    var answer = 0
    var missingWeight = -1

    input.forEachIndexed { index, item ->
        if(item != '*') {
            val target = item.digitToInt()
            if ((index + 1) % 2 == 0) {
                answer += target * 3
            } else {
                answer += target
            }
        }else{
            missingWeight = if ((index + 1) % 2 == 0) 3 else 1
        }
    }

    val remainder = answer % 10
    val targetRemainder = (10 - remainder) % 10

    if(missingWeight == 1) println(targetRemainder)
    else println((targetRemainder * 7) % 10)
}
