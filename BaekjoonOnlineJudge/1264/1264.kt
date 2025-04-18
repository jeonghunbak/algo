fun main() {
   while (true) {
       val input = readln()
       if(input == "#") break

       println(input.count { it.lowercaseChar() in "aeiou" })
   }
}
