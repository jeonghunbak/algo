fun main(){
    val arr = IntArray(26)
    val input = readln()

    input.forEach { ch ->
        val idx = ch - 'a'
        arr[idx]++
    }

    print(arr.joinToString(" "))
}
