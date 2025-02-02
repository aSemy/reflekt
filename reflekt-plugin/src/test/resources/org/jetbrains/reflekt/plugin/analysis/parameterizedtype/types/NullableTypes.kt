package org.jetbrains.reflekt.plugin.analysis.parameterizedtype.types

import java.util.ArrayList

fun main() {
    fooWithType<Any>("Any (kotlin.Any)")
    fooWithType<Any?>("Any? (kotlin.Any)")

    fooWithType<Unit>("Unit (kotlin.Unit)")
    fooWithType<Unit?>("Unit? (kotlin.Unit)")

    fooWithType<String>("String (kotlin.String)")
    fooWithType<String?>("String? (kotlin.String)")

    fooWithType<ArrayList<() -> Unit>?>("ArrayList<Function0<Unit>>? (java.util.ArrayList)")

    fooWithType<MyObject?>("MyObject? (org.jetbrains.reflekt.plugin.analysis.parameterizedtype.types.MyObject)")
}
