/**
 * @author dragomir on 11/8/17.
 */
fun main(args: Array<String>) {
    print("Type some numba: ")
    val range: Array<Int> = arrayOf(11, 12, 13)

    for ((index, value) in range.withIndex()) {
        println("$index, $value")
    }
    for (i in range.indices) {
        println("$i")
    }

    val size: Int? = readLine()?.toInt()

    when (size) {
        in 1..10 -> println("Classic")
        in range -> println("OK")
        in 20..23 -> println("NOK")
        else -> println("poy")
    }
}