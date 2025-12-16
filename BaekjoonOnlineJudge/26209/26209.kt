fun main(){
    val list = readln().split(" ").map { it.toInt() }
    if(list.contains(9)) print("F")
    else print("S")
}
