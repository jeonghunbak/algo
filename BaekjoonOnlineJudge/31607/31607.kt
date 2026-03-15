fun main(){
    val arr = List(3) { readln().toInt() }.sorted()
    println(if (arr[0] + arr[1] == arr[2]) 1 else 0)
}
