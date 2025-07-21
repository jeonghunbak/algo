fun main(){
    val cnt = readln().toInt()
    val list = mutableListOf<Int>()

    repeat(cnt) {
        val input = readln().split(" ").map(String::toInt)
        if(input[1] == 0) list.add(input[0])
    }

    if(list.size == 0) {
        print(-1)
    } else {
        list.sort()
        print(list.first())
    }
}
