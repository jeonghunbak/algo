fun main(args: Array<String>) {
    var answer = 0;

    for(i in 0 until 5){
        var input = readLine()!!.toInt()

        if(input < 40) input = 40

        answer += input / 5
    }

    print(answer / 5)
}
