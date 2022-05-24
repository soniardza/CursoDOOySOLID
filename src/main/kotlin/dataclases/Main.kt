package dataclases

fun main() {
    val firstSong = Song(
        "Yellow",
        "Coldplay"
    )

    val secondSong = Song(
        "Yellow",
        "Coldplay"
    )

    println("are song classes equals?: ${firstSong == secondSong}")

    println()
    val dataClassSong = Song(
        "Yellow",
        "Coldplay"
    )

    val dataClassSong2 = Song(
        "Yellow",
        "Coldplay"
    )

    println("are song data classes equals?: ${dataClassSong == dataClassSong2}")
}