data class People(val name: String, val score: Int)

fun main() {
    val cnt = readln().toInt()
    val arr = mutableListOf<People>()

    repeat(cnt) {
        val input = readln().split(" ")

        arr.add(People(input[0], input[1].toInt()))
    }

    arr.sortWith(compareByDescending<People>( { it.score }).thenBy { it.name })
    
    println(arr.first().name)
}
