package ders8

fun main() {

    var bakiye = 500

    while (bakiye > 0) {
        var harcananTutar = (50..100).random()
        bakiye -= harcananTutar
        println("Harcama: $harcananTutar TL, Kalan Bakiye: $bakiye TL")
    }


}