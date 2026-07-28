package ders9

fun main() {

    var isim: String = "Ahmet"
    // isim = null // Derleme Hatası
    println(isim.length)

    var ikinciIsim: String? = "Can"
    ikinciIsim = null // Değişken tipi nullable olduğu için sorun çıkmaz. (String?)
}