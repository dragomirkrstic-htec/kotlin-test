package rs.htec.kotlin

/**
 * @author dragomir on 11/8/17.
 */
class RegularClass(val name: String, number: Int) {
    companion object {
        const val WONT_CHANGE: String = "POY"
    }

    private var number: Int = 2
        set(value) {
            if (value < 0)
                number = 999
        }

    constructor(name: String) : this(name, 0)

    fun doSomething() {
        println("{$name | $number}")
    }
}