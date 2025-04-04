data class Person(val name: String, val age: Int, val joinNum: Int)

fun main() {
    val cnt = readln().toInt()
    val arr: Array<Person?> = arrayOfNulls(cnt)

    repeat(cnt){ index ->
        val input = readln().split(" ")
        arr[index] = Person(input[1], input[0].toInt(), index)
    }

    val sortedArr = arr.sortedArrayWith(compareBy<Person?> { it?.age }.thenBy { it?.joinNum })

    sortedArr.forEach { person ->
        println("${person?.age} ${person?.name}")
    }
}
