fun main() {
    val (x, y, n) = readln().split(" ").map { it.toInt() }

    for(i in 1..n) {
        if(i % x == 0 && i % y == 0) println("FizzBuzz")
        else if(i % x == 0) println("Fizz")
        else if(i % y == 0) println("Buzz")
        else println(i)
    }
}
