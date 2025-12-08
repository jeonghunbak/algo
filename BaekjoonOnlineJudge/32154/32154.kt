data class RankEntry(
    val cnt: Int,
    val problems: List<String>
)

fun main() {
    val top10 = arrayOf(
        RankEntry(
            cnt = 11,
            problems = listOf("A","B","C","D","E","F","G","H","J","L","M")
        ),
        RankEntry(
            cnt = 9,
            problems = listOf("A","C","E","F","G","H","I","L","M")
        ),
        RankEntry(
            cnt = 9,
            problems = listOf("A","C","E","F","G","H","I","L","M")
        ),
        RankEntry(
            cnt = 9,
            problems = listOf("A","B","C","E","F","G","H","L","M")
        ),
        RankEntry(
            cnt = 8,
            problems = listOf("A","C","E","F","G","H","L","M")
        ),
        RankEntry(
            cnt = 8,
            problems = listOf("A","C","E","F","G","H","L","M")
        ),
        RankEntry(
            cnt = 8,
            problems = listOf("A","C","E","F","G","H","L","M")
        ),
        RankEntry(
            cnt = 8,
            problems = listOf("A","C","E","F","G","H","L","M")
        ),
        RankEntry(
            cnt = 8,
            problems = listOf("A","C","E","F","G","H","L","M")
        ),
        RankEntry(
            cnt = 8,
            problems = listOf("A","B","C","F","G","H","L","M")
        )
    )

    val input = readln().toInt() - 1

    println(top10[input].cnt)
    println(top10[input].problems.joinToString(" "))
}
