fun main(){
    val (a, b) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }
    val answer = mutableListOf<Int>()

    for(item in list){
        answer.add(item - (a * b))
    }

    print(answer.joinToString(" "))
}
