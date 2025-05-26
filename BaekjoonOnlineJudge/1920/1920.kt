fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }.toSet()

    val m = br.readLine().toInt()
    val b = br.readLine().split(" ").map { it.toInt() }

    for (target in b) {
        bw.write(if (target in a) "1\n" else "0\n")
    }

    bw.flush()
}
