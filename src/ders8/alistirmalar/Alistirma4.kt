package ders8.alistirmalar

fun main() {

    disDongu@ for (sinif in 1..5) {
        for (ogrenci in 1..10) {
            println("$sinif. sınıf, $ogrenci. öğrenci.")
            if (sinif == 3 && ogrenci == 5) {
                println("Aranan öğrenci bulundu.")
                break@disDongu
            }
        }
    }
}