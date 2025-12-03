fun main(){
    readln()
    val list = readln().split(" ")
    val target = readln()
    print(list.count { it == target })
}
