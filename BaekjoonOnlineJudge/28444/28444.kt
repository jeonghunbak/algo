fun main() {
    val list = readln().split(" ").map { it.toInt() }
    
    val hr = list[0] * list[1];
    val arc = list[2] * list[3] * list[4]
    
    print(hr - arc)
}
