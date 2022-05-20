package clasesyobjetos

fun main() {

    // Instanciando Objetos
    val firstSong = Song(
        title = "As it was",
        artist = "Harry Styles"
    )

    val secondSong = Song(
        title = "Fix you",
        artist = "Coldplay"
    )

    val thirdSong = Song(
        title = "Paparazzi",
        artist = "Lady Gaga"
    )

    // Usando sus componentes: Funciones
    secondSong.play()
    secondSong.stop()
    thirdSong.play()
}