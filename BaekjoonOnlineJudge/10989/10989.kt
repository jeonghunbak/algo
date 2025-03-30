fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val cnt = br.readLine().toInt()
    val answer = IntArray(10001)

    repeat(cnt){
        val idx = br.readLine().toInt()
        answer[idx]++
    }

    for (i in answer.indices){
        bw.write("${i}\n".repeat(answer[i]))
    }
    bw.flush()
    bw.close()
}
