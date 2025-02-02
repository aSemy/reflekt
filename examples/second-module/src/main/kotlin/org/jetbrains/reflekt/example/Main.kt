package org.jetbrains.reflekt.example

import org.jetbrains.reflekt.SmartReflekt

fun main() {
    val smartFunctions = SmartReflekt.functions<() -> Unit>().filter { it.isTopLevel && it.name == "foo" }.resolve()
    println(smartFunctions)
    smartFunctions.forEach { it() }
}
