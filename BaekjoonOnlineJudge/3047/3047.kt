fun main() {
    val nums = readln().split(" ").map { it.toInt() }.sorted()
    val index = readln().map { it - 'A'}

    index.forEach { it ->
        print("${nums[it]} ")
    }
}
