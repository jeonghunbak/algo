fun main() {
    while (true) {
        val input = readln()
        if(input == "0") break

        var answer = input.length + 1

        input.forEach { it ->
            if(it == '1') answer += 2
            else if(it == '0') answer += 4
            else answer += 3
        }

        println(answer)
    }
}
