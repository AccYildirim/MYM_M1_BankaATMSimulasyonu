package ders8

fun main() {

    var secim: String

    do {
        print("Oyun bitti! Tekrar oynamak ister misiniz? (E/H): ")
        secim = readln().trim().lowercase()
    } while (secim == "e" || secim == "evet")

    println("Uygulama kapatıldı.")

}