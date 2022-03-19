package org.jetbrains.reflekt.buildutils

import org.jetbrains.kotlin.gradle.plugin.getKotlinPluginVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("org.jetbrains.reflekt.buildutils.maven-publish-convention")
    id("org.jetbrains.reflekt.buildutils.diktat-convention")
    id("org.jetbrains.reflekt.buildutils.detekt-convention")
}

group = rootProject.group
version = rootProject.version

dependencies {
    // Must be platform, not enforcedPlatform, else versions in consuming libraries will be overridden.
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:${getKotlinPluginVersion()}"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        languageVersion = "1.5"
        apiVersion = "1.5"
        jvmTarget = "11"
        // Current Reflekt version does not support incremental compilation process
        incremental = false
    }
    kotlinOptions.freeCompilerArgs += listOf(
        "-Xopt-in=kotlin.RequiresOptIn",
    )
}

kotlin {
    jvmToolchain {
        (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of("11"))
    }
}
