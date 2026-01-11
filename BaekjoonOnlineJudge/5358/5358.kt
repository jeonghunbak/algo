fun main() {
    while (true) {
        try {
            println(
                readln().map {
                    when (it) {
                        'i' -> 'e'
                        'e' -> 'i'
                        'I' -> 'E'
                        'E' -> 'I'
                        else -> it
                    }
                }.joinToString("")
            )
        } catch (e: Exception) {
            break
        }
    }
}
