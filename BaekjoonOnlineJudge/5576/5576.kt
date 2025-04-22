fun main() {
    val a = mutableListOf<Int>()
    val b = mutableListOf<Int>()

    repeat(20) { index ->
        if(index <10) a.add(readln().toInt())
        else b.add(readln().toInt())
    }

    a.sortDescending()
    b.sortDescending()

    print("${a[0] + a[1] + a[2]} ${b[0] + b[1] + b[2]}")
}
