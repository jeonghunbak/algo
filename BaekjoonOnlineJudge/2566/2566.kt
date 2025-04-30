fun main() {
     var answer = -1
     val coordinate = IntArray(2)

     repeat(9) { index ->
          val input = readln().split(" ").map { it.toInt() }
          if (input.max() > answer) {
              val (idx, maxVal) = input.withIndex().maxByOrNull { it.value }!!
               coordinate[0] = index + 1
               coordinate[1] = idx + 1
               answer = maxVal
          }
     }

     println(answer)
     println(coordinate.joinToString(" "))
}
