fun main() {
     val input = List(5) { readln().toInt() }
     val hamburger = input.take(3).toIntArray()
     val beverage = input.takeLast(2).toIntArray()
     
     val answer = hamburger.min() + beverage.min() - 50
     println(answer)
}
