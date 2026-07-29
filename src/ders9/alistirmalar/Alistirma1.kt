package ders9.alistirmalar

fun main() {

    println("Lütfen adınızı giriniz: ")
    val ad = readln()
    var soyad: String? = null
    var yas: Int? = null


    println("Soyadınızı giriniz: ")
    soyad = readln()
    var gosterilecekSoyad = soyad ?: "(Soyad belirtilmemiş)"

    println("Yaşınızı giriniz: ")
    yas = readln().toIntOrNull()
    val gosterilecekYas = yas ?: 0

    println("Merhaba $ad, $gosterilecekSoyad, Yaşınız: $gosterilecekYas")

}