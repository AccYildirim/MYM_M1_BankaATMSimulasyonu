package ders6

fun main() {
    val hamGirdi = " mERhaBa Kotlin "
    println("Ham Girdi: $hamGirdi")

    val temizGirdi = hamGirdi.trim().lowercase()
    println("Temiz Girdi: $temizGirdi")

    if (hamGirdi == "merhaba kotlin") {
        println("Doğru")
    }

    if (temizGirdi.contains("kotlin")) {
        println("İçeriyor")
    }

    println(temizGirdi.substring(8))
    println(temizGirdi.split(" ")[0])

    print("Adın: ")
    val ad = readln().trim().lowercase()
    val temizlenmisAd = ad.replaceFirstChar { it.uppercase() }
    println(temizlenmisAd)

}