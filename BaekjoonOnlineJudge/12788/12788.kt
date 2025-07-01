fun main() {
    val people = readln().toInt()
    val teams = readln().split(" ").map { it.toInt() }
    val pens = readln().split(" ").map { it.toInt() }.sortedDescending()
    val sum = teams[0] * teams[1]
    var temp = 0
    var answer = 0

    for (i in 0 until pens.size){
        temp += pens[i]
        answer++
        if(temp >= sum) break
    }
    print(if(temp < sum) "STRESS" else answer)
}
