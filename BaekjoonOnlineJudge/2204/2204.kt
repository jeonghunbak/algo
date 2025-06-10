fun main() {
    while(true){
        val cnt = readln().toInt()
        if(cnt == 0) break

        val list = mutableListOf<String>()
        repeat(cnt){
            list.add(readln())
        }
        println(list.sortedWith(String.CASE_INSENSITIVE_ORDER)[0])
    }
}
