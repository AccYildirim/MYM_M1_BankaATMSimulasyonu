package ders8.alistirmalar

fun main() {

    do {
        var rastgeleSayi = (1..6).random()
        if (rastgeleSayi == 6) {
            println("Şanslı altı geldi! Oyun bitiyor.")
            break
        } else {
            println("Zar: $rastgeleSayi geldi, tekrar atılıyor…")
        }
    } while (true)
}