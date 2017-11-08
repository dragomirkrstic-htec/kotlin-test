package rs.htec.kotlin

import java.util.*

/**
 * @author dragomir on 11/8/17.
 */
class Implementation : Service {

    override fun serve() {
        println("Value: ${Random().nextInt(128)}")
    }
}