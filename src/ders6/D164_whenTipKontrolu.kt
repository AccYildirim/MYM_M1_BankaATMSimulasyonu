package ders6

fun main() {
    val gizemliObje: Any = "Merhaba Kotlin"

    when (gizemliObje) {
        is String -> println("Bu bir string ifadedir. Uzunluğu ${gizemliObje.length}")
        is Int -> println("Bu bir tamsayıdır. Bu sayının karesi: ${gizemliObje * gizemliObje}")
        else -> println("Bilinmeyen tip")
    }


}