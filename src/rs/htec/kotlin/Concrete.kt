package rs.htec.kotlin

/**
 * @author dragomir on 11/8/17.
 */
class Concrete(name: String, private var age: Int) : BaseClass(name) {

    override fun action() {
        data = 100
        super.action()
        println(age)
        println("Mhm $data")
        println("$name")
    }

}