package ders6.alistirmalar

fun main() {

    println("Lütfen 1 ile 12 arasında bir ay numarası giriniz: ")
    val ayNumarasi = readln().toIntOrNull()

    val mevsim = when (ayNumarasi) {
        12, 1, 2 -> "Kış"
        3, 4, 5 -> "İlkbahar"
        6, 7, 8 -> "Yaz"
        9, 10, 11 -> "Sonbahar"
        else -> "Geçersiz sayı!"
    }
    println("Seçtiğiniz ayın mevsimi: $mevsim")

}