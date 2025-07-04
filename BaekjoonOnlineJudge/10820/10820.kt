fun main() {
    while (true){
        val str = readlnOrNull()

        if(str == null) break

        var lower = 0
        var upper = 0
        var number = 0
        var space = 0

        for(ch in str){
            when {
                ch.isLowerCase() -> lower++
                ch.isUpperCase() -> upper++
                ch.isDigit() -> number++
                ch.isWhitespace() -> space++
            }
        }
        println("$lower $upper $number $space")
    }
}

