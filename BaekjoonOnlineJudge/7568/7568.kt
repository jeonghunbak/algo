data class Person(val weight: Int, val height: Int)

fun main() {
    val cnt = readln().toInt()
    val arr = mutableListOf<Person>()

    repeat(cnt) {
        val (w, h) = readln().split(" ").map { it.toInt() }
        arr.add(Person(w, h))
    }

    for(i in 0 until cnt){
        var answer = 1
        val now = arr[i]

        for(j in 0 until cnt){
            if(i == j) continue

            val next = arr[j]

            if(now.weight < next.weight && now.height < next.height){
                answer++
            }
        }
        print("${answer} ")
    }
}
