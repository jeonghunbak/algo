fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Boolean>()
    val answer = mutableListOf<String>()

    repeat(n){
        val input = readln()
        map[input] = true
    }

    repeat(m){
        val input = readln()
        if(map.containsKey(input) == true){
            answer.add(input)
        }
    }
    answer.sort()
    println(answer.size)
    println(answer.joinToString("\n"))
}
