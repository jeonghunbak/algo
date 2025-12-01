fun main() {
    while (true) {
        val input = readln()
        if (input == "0 0 0 0") break

        val parts = input.split(" ").map { it.toInt() }
        val l = parts[0]
        val w = parts[1]
        val h = parts[2]
        val v = parts[3]

        val calcL: Int
        val calcW: Int
        val calcH: Int
        val calcV: Int

        if (l == 0) {
            calcL = v / (w * h)
            calcW = w
            calcH = h
            calcV = v
        } else if (w == 0) {
            calcL = l
            calcW = v / (l * h)
            calcH = h
            calcV = v
        } else if (h == 0) {
            calcL = l
            calcW = w
            calcH = v / (l * w)
            calcV = v
        } else if (v == 0) {
            calcL = l
            calcW = w
            calcH = h
            calcV = l * w * h
        } else {
            calcL = l
            calcW = w
            calcH = h
            calcV = v
        }

        println("$calcL $calcW $calcH $calcV")
    }
}
