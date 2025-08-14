fun main(){
    val input = readln().split(" ").map { it.toInt() }

    if(input.sum() >= 100) {
        print("OK")
    } else {
        val idx = input.withIndex().minByOrNull { it.value }?.index

        when(idx){
            0 -> print("Soongsil")
            1 -> print("Korea")
            2 -> print("Hanyang")
        }
    }
}
