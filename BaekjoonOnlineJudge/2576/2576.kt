fun main() {
    var arr = mutableListOf<Int>()
    
    repeat(7) {
        val input = readln().toInt()
        if(input % 2 != 0) arr.add(input)
    }

    if (arr.isEmpty()) {
        println(-1)
    } else {
        println(arr.sum())
        println(arr.min())
    }
}
