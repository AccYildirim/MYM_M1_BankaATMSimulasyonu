package ders6.alistirmalar

fun main() {

    println("Lütfen sepetinizin toplam tutarını ondalık sayı olarak giriniz: ")

    val sepetTutari = readln().toDoubleOrNull()

    if (sepetTutari != null) {
        when (sepetTutari) {
            in 0.00..99.99 -> {
                val kargoUcreti = 30.00
                println("Kargo ücreti $kargoUcreti. Toplam ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }

            in 100.0..299.99 -> {
                val kargoUcreti = 15
                println("Kargo ücreti $kargoUcreti. Toplam ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }

            in 300.0..Double.MAX_VALUE -> {
                val kargoUcreti = 15
                println("Kargo ücreti $kargoUcreti. Toplam ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }

            else -> println("Tutar 0'ın altı olamaz!")
        }
    }


}