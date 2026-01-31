package com.saishaddai

/**
 * Imagine that you need to create a music-player app.
 *
 * Create a class that can represent the structure of a song. The Song class must include these code elements:
 *
 * Properties for the title, artist, year published, and play count
 * A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
 * A method that prints a song description in this format:
 * "Title, performed by artist, was released in [year published]."
 */

data class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int,
    val popular: Boolean = playCount > 999
)

fun main() {
    Song(
        title = "Clair",
        artist = "Gilbert O\'Sullivan",
        yearPublished = 1972,
        playCount = 1000,
    ).print()
}

fun Song.print() {
    val suffix = if (popular) "It's popular!" else ""
    println("$title, performed by $artist, was released in $yearPublished. $suffix")
}