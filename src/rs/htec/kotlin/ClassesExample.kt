package rs.htec.kotlin

/**
 * @author dragomir on 11/8/17.
 */
fun main(args: Array<String>) {

    val regular = RegularClass("Laneno", 23)
    // name is public
    regular.doSomething()
    println(RegularClass.WONT_CHANGE)

    var base = BaseClass("Parent")
    base.action()
    base.notShared()
    val concrete = Concrete("Concrete", 29)
    concrete.action()
    base = Concrete("Kako ovo, brt?!", 29)
    base.action()
    println()

    val service = Implementation()
    service.serve()
    val delegate = ServiceWithDelegate(service)
    delegate.serve()
    println()

    hey()
    base.hey()

    val col: List<Int> = List(10, { i -> i * 2 })
    val result = max(col, { a: Int, b: Int -> a < b })
    println(result)
}