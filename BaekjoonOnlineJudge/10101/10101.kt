fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val sum = a + b + c

    if (a == 60 && b == 60 && c == 60) {
        println("Equilateral")
    } else if (sum == 180 && (a == b || b == c || a == c)) {
        println("Isosceles")
    } else if (sum == 180) {
        println("Scalene")
    } else {
        println("Error")
    }
}
