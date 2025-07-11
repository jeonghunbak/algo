fun main() {
    readln().toInt()
    val files = readln().split(" ").map { it.toInt() }
    val cluster = readln().toInt()
    var answer = 0L

    for (it in files) {
        if(it == 0) continue
        var cnt = it / cluster.toLong()
        if (it % cluster != 0) {
            cnt += 1L
        }
        answer += (cluster * cnt)
    }
    print(answer)
}

