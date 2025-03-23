fun main(args: Array<String>) {
    var sum = 0;

    for(i in 0 until 5){
        var input = readLine()!!.toInt()

        if(input < 40) input = 40

        sum += input
    }

    print(sum / 5)
}
