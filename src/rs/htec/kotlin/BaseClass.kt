package rs.htec.kotlin

/**
 * @author dragomir on 11/8/17.
 */
open class BaseClass(name: String) {

    val name: String = name
    open var data: Int = 0

    open fun action() {
        println("---------- $name $data ----------")
    }

    fun notShared() {
        println("Evo, ovoliki!")
    }
}