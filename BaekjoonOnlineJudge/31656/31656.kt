fun main() {
    val s = readln()
    val result = s.fold(StringBuilder()) { acc, c ->
        if (acc.isEmpty() || acc.last() != c) acc.append(c)
        acc
    }

    print(result.toString())
}
