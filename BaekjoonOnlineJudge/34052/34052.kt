fun main(){
    var sum = 300

    repeat(4) {
        val input = readLine()!!.toInt()
        sum += input
    }
    print(if(sum > 1800) "No" else "Yes")
}
