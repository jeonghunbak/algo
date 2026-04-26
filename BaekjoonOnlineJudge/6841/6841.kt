fun main() {
    val dict = mapOf(
        "CU" to "see you",
        ":-)" to "I’m happy",
        ":-(" to "I’m unhappy",
        ";-)" to "wink",
        ":-P" to "stick out my tongue",
        "(~.~)" to "sleepy",
        "TA" to "totally awesome",
        "CCC" to "Canadian Computing Competition",
        "CUZ" to "because",
        "TY" to "thank-you",
        "YW" to "you’re welcome",
        "TTYL" to "talk to you later"
    )

    while (true) {
        val word = readln()

        println(dict[word] ?: word)

        if (word == "TTYL") break
    }
}
