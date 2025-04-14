fun main() {
    val cnt = readln().toInt()
    var armor = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }.toMutableList()
    var answer = 0

    var start = 0
    var end = cnt - 1

    arr.sort()

    while (start < end){
        if(arr[start] + arr[end] == armor){
            answer++
            start++
            end--
        }else if(arr[start] + arr[end] < armor){
            start++
        }else if(arr[start] + arr[end] > armor){
            end--
        }
    }

    println(answer)
}
