fun factorial(n: Int): Int {
     var result = 1
     for (i in 2..n) {
          result *= i
     }
     return result
}

fun main() {
     val (n, k) = readln().split(" ").map { it.toInt() }
     val answer = factorial(n) / (factorial(k) * factorial(n - k))
     println(answer)
}
