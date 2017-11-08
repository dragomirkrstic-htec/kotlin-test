/**
 * @author dragomir on 11/7/17.
 */

fun main(args: Array<String>) {
    val lang = readLine()

    when (lang) {
        "EN" -> {
            println("Hello world")
        }
        "FR" -> {
            println("Blablabla")
        }
        "RS" -> {
            println("Pozdrav, svete!")
        }
        else -> println("Sorry, can't understand you.")
    }

}