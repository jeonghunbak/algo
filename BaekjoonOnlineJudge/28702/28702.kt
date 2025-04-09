fun main () {
    var index = 0
    var num = 0
    var next = 0

    for (i in 0..3) {
        val input = readln()
        if (input.toIntOrNull() != null) {
            index = i
            num = input.toInt()
            break
        }
    }
    next = num + (3 - index)

    if (next % 3 == 0 && next % 5 == 0) {
        println("FizzBuzz")
    } else if (next % 3 == 0 && next % 5 != 0) {
        println("Fizz")
    } else if (next % 3 != 0 && next % 5 == 0) {
        println("Buzz")
    } else {
        println(next)
    }
}
