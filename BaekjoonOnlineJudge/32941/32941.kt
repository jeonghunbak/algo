fun main(){
    val (room, hour) = readln().split(" ").map { it.toInt() }
    val student = readln().toInt()
    
    repeat(student) {
        readln()
        val times = readln().split(" ").map { it.toInt() }
        if (hour !in times) {
            print("NO")
            return
        }
    }
    print("YES")
}
