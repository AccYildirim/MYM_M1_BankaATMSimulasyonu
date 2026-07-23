package ders7.alistirmalar

fun main() {

    var sonuc = 0

    for (sayi in 2..100 step 2) {
        sonuc += sayi
    }
    println("1 ile 100 arasındaki çift sayıların toplamı: $sonuc")
}