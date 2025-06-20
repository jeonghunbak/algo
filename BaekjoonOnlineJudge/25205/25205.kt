fun main() {
    val list = listOf('r', 's', 'e', 'f', 'a', 'q', 't', 'd', 'w', 'c', 'z', 'x', 'v', 'g')
    val sLen = readln().toInt()
    val str = readln()

    print(if(list.contains(str.get(sLen - 1))) 1 else 0)
}
