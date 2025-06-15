fun main() {
    val input = readln().toInt()
    var list = mutableListOf<Int>()

    for(i in 1 .. input) {
        list.add(i)
    }

    while(list.size > 1) {
        list = list.filterIndexed { index, value ->
            index % 2 != 0
        } as MutableList<Int>
    }
    print(list.first())
}
