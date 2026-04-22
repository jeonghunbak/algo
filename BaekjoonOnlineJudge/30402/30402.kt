fun main() {
    repeat(15) {
        val line = readln()

        when {
            'w' in line -> {
                println("chunbae")
                return
            }
            'b' in line -> {
                println("nabi")
                return
            }
            'g' in line -> {
                println("yeongcheol")
                return
            }
        }
    }
}
