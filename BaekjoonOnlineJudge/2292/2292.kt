fun main() {
    val input = readln().toInt()

    if(input == 1){
        print(input)
    } else {
        var cnt = 1
        var end = 1

        while (end < input){
            cnt++
            end += (cnt - 1) * 6
        }
        print(cnt)
    }
}
