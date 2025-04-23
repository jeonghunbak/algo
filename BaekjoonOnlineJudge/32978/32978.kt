fun main() {
     val cnt = readln().toInt()
     val recipe = readln().split(" ")
     val used = readln().split(" ")
     val missing = (recipe.toSet() - used.toSet()).first()

     println(missing)
}
