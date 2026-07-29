package ders9.alistirmalar

fun main() {


    println("Doğum yılınızı giriniz: ")
    val dogumYili = readln().toIntOrNull() ?: 2026
    println(dogumYili)


}