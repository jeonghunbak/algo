fun main() {
    val cnt = readln().toInt()
    val sequence = mutableListOf<Int>()
    val stack = ArrayDeque<Int>()
    var targetIdx = 0
    var currentNum = 1
    val answer = mutableListOf<Char>()

    repeat(cnt){
        sequence.add(readln().toInt())
    }

    while (targetIdx != cnt){
        val lastNum = stack.lastOrNull()
        val target = sequence[targetIdx]

        if(lastNum == null || lastNum < target){
            stack.addLast(currentNum)
            answer.add('+')
            currentNum++
        }else if(lastNum == target){
            stack.removeLast()
            answer.add('-')
            targetIdx++
        }else if(lastNum > target){
            break
        }
    }

    if(stack.size != 0){
        print("NO")
    }else{
        print(answer.joinToString("\n"))
    }
}
