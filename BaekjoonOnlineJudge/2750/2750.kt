fun main() {
     val cnt = readln().toInt()
     val arr = mutableListOf<Int>()

     repeat(cnt) {
          val input = readln().toInt()
          arr.add(input)
     }

     arr.sort()

     arr.forEach{
          println(it)
     }
}
