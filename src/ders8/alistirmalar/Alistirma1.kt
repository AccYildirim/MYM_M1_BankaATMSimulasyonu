package ders8.alistirmalar

fun main() {

    val dogruSifre = "1234"
    var kullaniciSifre: String

    do {
        println("Lütfen şifrenizi giriniz: ")
        kullaniciSifre = readln()
    } while (kullaniciSifre != dogruSifre)
    println("Giriş başarılı.")


}