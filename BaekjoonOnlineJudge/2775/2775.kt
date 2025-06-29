fun main() {
    val cnt = readln().toInt()

    repeat(cnt){
        val y = readln().toInt()
        val x = readln().toInt()

        val apartment: Array<IntArray> = Array(y + 1) { IntArray(x + 1) { 0 } }

        for (i in 1..x){
            apartment[0][i] = i
        }

        for (i in 1..y){
            for(j in 1..x){
                apartment[i][j] = apartment[i-1][j] + apartment[i][j-1]
            }
        }
        println(apartment[y][x])
    }
}
