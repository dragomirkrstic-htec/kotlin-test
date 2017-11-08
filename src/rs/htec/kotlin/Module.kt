package rs.htec.kotlin

/**
 * @author dragomir on 11/8/17.
 */
fun hey() {
    println("Hey!")
}

fun BaseClass.hey() {
    println("Hey hey!")
}

fun <T> max(collection: List<T>, less: (T, T) -> Boolean): T? {
    var max: T? = null
    for (it in collection) {
        if (max == null || less(max, it))
            max = it
    }

    return max
}
