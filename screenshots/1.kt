fun roundNumber(n: Int): String {
    return when {
        n < 1000 -> n.toString()
        n in 1000..9999 -> {
            "${n / 1000}K"
        }
        else -> "Число слишком большое"
    }
}
fun main() {
    println("Введите число:")
    val a= readLine()
    if (a != null && a.all { it.isDigit() }) {
        val n = a.toInt()
        println(roundNumber(n))
    }
}
