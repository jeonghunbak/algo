un main(args: Array<String>) {
    val cnt = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    var answer = 0;

    for (i in 0 until cnt){
        answer += isPrime(arr.get(i))
    }

    println(answer)
}

fun isPrime(num: Int): Int{
    if(num == 1) return 0

    for (i in 2 until num - 1){
        if(num % i == 0) return 0
    }

    return 1;
}
