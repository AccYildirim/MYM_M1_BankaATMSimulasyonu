package ders6.alistirmalar

fun main() {

    println("Lütfen yaşınızı giriniz: ")
    val girdi = readln().toIntOrNull()

    if (girdi != null) {
        val biletGirdisi = when (girdi) {
            in 0..6 -> "Ücretsiz tarife 0 TL"
            in 7..18 -> "Öğrenci tarifesi 50 TL"
            in 19..64 -> "Tam tarife 100 TL"
            in 65..120 -> "Emekli indirimi 40 TL"
            else -> "Geçersiz yaş girdiniz."
        }
        println(biletGirdisi)
    }
}