package io.reflekt.codegen.test

import io.reflekt.Reflekt

fun main() {
    val objects = Reflekt.objects().withSupertypes(AInterfaceTest::class, BInterfaceTest::class)
    val objects1 = Reflekt.objects().withSupertype<Any>()
}