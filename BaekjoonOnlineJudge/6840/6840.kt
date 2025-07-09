fun main() {
    val arr = mutableListOf<Int>()
    repeat(3){
        arr.add(readln().toInt())
    }
    arr.sort()
    println(arr[1])
}
