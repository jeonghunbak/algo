fun main(){
    val input = readln().split(" ").map { it.toInt() }
    val cnt = input.groupingBy { it }.eachCount()
    val duplicate = cnt.filter { it.value > 1 }.entries.singleOrNull()

    if(duplicate != null){
        when(duplicate.value){
            3 -> print(10000 + duplicate.key * 1000)
            2 -> print(1000 + duplicate.key * 100)
        }
    }else{
        println(input.max() * 100)
    }
}
