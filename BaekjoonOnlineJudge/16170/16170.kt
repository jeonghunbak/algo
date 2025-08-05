import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

fun main() {
    val now = Instant.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        .withZone(ZoneId.of("UTC"))

    val formattedUtcNow = formatter.format(now).split("-")

    println(formattedUtcNow[0])
    println(formattedUtcNow[1])
    println(formattedUtcNow[2])
}
