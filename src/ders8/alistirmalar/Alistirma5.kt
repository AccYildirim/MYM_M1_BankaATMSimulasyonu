package ders8.alistirmalar

fun main() {

    var flag = true
    do {
        println(
            """
            a. Bakiye Göster
            b. Para Çek
            c. Çıkış    
        """.trimIndent()
        )
        print("Lütfen seçiminizi yapın: ")
        var secim = readln()[0]

        when (secim) {
            'a' -> println("Bakiye sorgulanıyor...")
            'b' -> println("Para çekiliyor...")
            'c' -> {
                println("İyi günler dileriz...")
                flag = false
            }

            else -> println("Geçersiz işlem!")
        }
    } while (flag)


}