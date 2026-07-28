package ders9

fun main() {

    var kullaniciAdi: String? = "Can"

    var gosterilecekIsim = kullaniciAdi ?: "Misafir"
    println("Merhaba, $gosterilecekIsim")

    //Elvis Operatörünün Açılımı
    if (gosterilecekIsim != null) {
        println("Merhaba, $gosterilecekIsim")
    } else {
        println("Merhaba, Misafir")
    }

    //İkinci Örnek
    var mesaj: String? = "Selam"
    var uzunluk = mesaj?.length ?: 0
    println("Mesajın uzunluğu: $uzunluk")

    //Üçüncü Örnek
    print("Yaşını Gir: ")
    var yas = readln().toIntOrNull() ?: "Yaşınızı sadece rakamları kullanarak girin!"
    println("Yaşınız: $yas")
}