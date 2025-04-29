fun main() {
     val cnt = readln().toInt()
     val list = List(cnt) { readln().toInt() }
     var answer = 0
     var standard = 0
     
     for (target in list.asReversed()) {
          if (target > standard) {
               answer++
               standard = target
          }
     }

     print(answer)
}
