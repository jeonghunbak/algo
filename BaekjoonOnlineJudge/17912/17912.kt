fun main(){
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val minIndex = list.indices.minByOrNull { list[it] }
    
    print(minIndex)
}
