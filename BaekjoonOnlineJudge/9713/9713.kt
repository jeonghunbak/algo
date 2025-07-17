fun main(){
    val cnt = readln().toInt()
    val answer = mutableListOf<Int>()
    var sum = 0

    repeat(cnt){
        var input = readln().toInt()
        var sum = 0

        for(i in 1..input step 2){
            sum += i
        }
        println(sum)
    }
}
