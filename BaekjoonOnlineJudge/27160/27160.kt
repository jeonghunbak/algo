fun main() {
     val cnt = readln().toInt()
     val map = mutableMapOf<String, Int>()
     var answer = "NO"

     repeat(cnt) {
          val (card, count) = readln().split(" ")
          val value = (map.get(card) ?: 0) + count.toInt()

          map.put(card, value)
     }

     for ((key, value) in map) {
          if (value == 5) {
               answer = "YES"
               break
          }
     }
     
     print(answer)
}
