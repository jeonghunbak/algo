data class Person(val name: String, val age: Int, val joinNum: Int)

fun main() {
    val cnt = readln().toInt()
    val arr = mutableListOf<Person>()

    repeat(cnt){ index ->
        val input = readln().split(" ")
        arr.add(Person(input[1], input[0].toInt(), index))
    }

    arr.sortWith(compareBy( { it.age }, { it.joinNum } ))

    arr.forEach { println("${it.age} ${it.name}") }
}
