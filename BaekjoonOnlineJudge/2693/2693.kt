fun main(){
    val cnt = readln().toInt()
    
    repeat(cnt) {
        val list = readln().split(" ").map { it.toInt() }
        val value = list
            .distinct()
            .sortedDescending()[3 - 1]
        println(value)
    }
}
