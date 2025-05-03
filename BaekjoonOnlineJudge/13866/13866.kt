fun main(){
    val arr = readln().split(" ").map { it.toInt() }.toMutableList()
    arr.sort()
    
    val max = arr[0] + arr[3]
    val min = arr[1] + arr[2]

    println(Math.abs(max - min))
}
