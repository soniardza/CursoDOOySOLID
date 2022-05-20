package clasesyobjetos

class Song(
    // Atributos
    val title: String,
    val artist: String
) {
    // Funcionalidades
    fun play() {
        println("Playing $title - $artist")
    }

    fun stop() {
        println("Stopping $title")
    }
}