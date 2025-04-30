fun main() {
     while (true) {
          val input = readln()
          if(input == "# 0 0") break

          val (name, age, weight) = input.split(" ")
          val cate = if(age.toInt() > 17 || weight.toInt() >= 80) "Senior" else "Junior"

          println("$name $cate")
     }
}
