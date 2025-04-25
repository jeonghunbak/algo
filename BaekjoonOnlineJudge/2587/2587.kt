fun main() {
     val input = mutableListOf<Int>()

     repeat(5) {
          input.add(readln().toInt())
     }

     input.sort()

     println(input.average().toInt())
     println(input[2])
}
