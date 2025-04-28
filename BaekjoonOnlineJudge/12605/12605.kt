fun main() {
     val cnt = readln().toInt()

     repeat(cnt) { index ->
          val arr = readln().split(" ").toMutableList()
          arr.reverse()
          val str = arr.joinToString(" ")

          println("Case #${index + 1}: $str")
     }
}
