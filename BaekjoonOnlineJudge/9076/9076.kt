fun main() {
     val cnt = readln().toInt()

     repeat(cnt) {
          val input = ArrayDeque(readln().split(" ").map { it.toInt() })
          
          input.sort()
          input.removeFirst()
          input.removeLast()

          if(input.max() - input.min() >= 4) {
               println("KIN")
          } else {
               println(input.sum())
          }
     }
}
