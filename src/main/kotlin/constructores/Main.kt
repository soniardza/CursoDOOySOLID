package constructores

import java.time.LocalDateTime
import java.time.Month

fun main() {
    val post = Post(
        name = "Tutorial de Kotlin",
        author = "Anahí Salgado",
        date = LocalDateTime.of(
            2022,
            Month.MAY,
            20,
            23,
            2
        )
    )

    println(post.publish())

    val postKotlinClass = Post(
        name = "Clases de Koltin",
        author = "Anahí Salgado",
        date = LocalDateTime.of(
            2022,
            Month.MAY,
            20,
            23,
            9
        ),
        content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        category = "kotlin"
    )

    println(postKotlinClass.publish())
}