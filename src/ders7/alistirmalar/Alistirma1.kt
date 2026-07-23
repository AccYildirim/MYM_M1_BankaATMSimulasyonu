package ders7.alistirmalar

fun main() {

    println("Lütfen 1 ile 10 arasında bir sayı giriniz: ")
    val sayi = readln().toIntOrNull()


    if (sayi == null) {
        println("Hata: Lütfen yalnızca tam sayı giriniz!")
    } else if (sayi !in 1..10) {
        println("Hata: 1 ile 10 arasında bir değer girin!")
    } else {
        for (i in 1..10) {
            val sonuc = sayi * i
            println("$sayi x $i = $sonuc")
        }
    }


}