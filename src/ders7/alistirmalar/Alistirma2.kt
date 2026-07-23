package ders7.alistirmalar

fun main() {

    println("Lütfen pozitif bir tam sayı giriniz: ")
    val girdi = readln().toIntOrNull()

    if (girdi != null && girdi > 0) {

        var sonuc = girdi

        for (i in girdi - 1 downTo 2) {
            sonuc *= i
        }
        println("$girdi! = $sonuc")

    } else {
        println("Hata: Lütfen sadece pozitif bir tam sayı girin!")
    }
}