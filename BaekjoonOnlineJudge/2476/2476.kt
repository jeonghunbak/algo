fun calcPrice(dice: String): Int {
    val input = dice.split(" ").map { it.toInt() }
    val cnt = input.groupingBy { it }.eachCount()
    val duplicate = cnt.filter { it.value > 1 }.entries.singleOrNull()
    var price = 0

    if(duplicate != null){
        when(duplicate.value){
            3 -> price = (10000 + duplicate.key * 1000)
            2 -> price = (1000 + duplicate.key * 100)
        }
    }else{
        price = (input.max() * 100)
    }

    return price
}

fun main(){
    val cnt = readln().toInt()
    val price = mutableListOf<Int>()
    repeat(cnt){
        price.add(calcPrice(readln()))
    }
    print(price.max())
}
