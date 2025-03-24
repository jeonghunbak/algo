fun main(args: Array<String>) {
    val input = readLine()!!.toString()
    var num = input
    var answer = 0;

    if(input.length < 2){
        num = "0${input}";
    }

    while(true){
        var left = num.first().toString()
        var right = num.last().toString()
        var sum = left.toInt() + right.toInt()
        
        num = right + sum.toString().last()
        answer++
        
        if(num.toInt() == input.toInt()) break
    }
    println(answer)
}
