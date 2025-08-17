fun main(){
    var sum = 0
    var max = 0

    repeat(4){
        val (exit, enter) = readln().split(" ").map { it.toInt() }
        sum = sum - exit + enter

        if(max < sum) max = sum
    }
    println(max)
}
