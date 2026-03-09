fun main(){
    val list = readln().split(" ").map { it.toInt() }.sorted()
    print(list[1])
}
