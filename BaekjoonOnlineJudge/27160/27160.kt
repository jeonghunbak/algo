fun main() {
     val cnt = readln().toInt()
     val map = mutableMapOf<String, Int>()

     repeat(cnt) {
          val (card, count) = readln().split(" ")
          map[card] = map.getOrDefault(card, 0) + count.toInt()
     }

     val answer = if (map.values.any { it == 5 }) "YES" else "NO"
     println(answer)
}
