fun years(n: Int): String {
    return when {
        n % 10 == 1 && n % 100 != 11 -> "$n год"
        n % 10 in 2..4 && (n % 100 !in 12..14) -> "$n года"
        else -> "$n лет"
    }
}

fun main() {
    println("Введите количество лет:")
    val age = readLine()

    if (age != null && age.all { it.isDigit() }) {
        val n = age.toInt()
        println(years(n))
    }
}
