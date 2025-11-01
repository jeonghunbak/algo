fun main(){
    val cnt = readln().toInt()

    repeat(cnt){
        val (x, y) = readln().split(" ").map { it.toInt() }

        repeat(y){
            println("X".repeat(x))
        }
        println()
    }
}
