package org.jetbrains.reflekt.plugin.utils

import org.jetbrains.reflekt.util.Util.PLUGIN_ID

import org.jetbrains.kotlin.config.CompilerConfigurationKey

import java.io.File

internal object Keys {
    val OUTPUT_DIR = CompilerConfigurationKey<File>("$PLUGIN_ID.outputDir")
    val ENABLED = CompilerConfigurationKey<Boolean>("$PLUGIN_ID.enabled")
    val DEPENDENCY_JARS = CompilerConfigurationKey<List<File>>("$PLUGIN_ID.dependencyJars")
    val REFLEKT_META_FILES = CompilerConfigurationKey<List<File>>("$PLUGIN_ID.reflektMetaFiles")
    val TO_SAVE_METADATA = CompilerConfigurationKey<Boolean>("$PLUGIN_ID.toSaveMetadata")
    val REFLEKT_META_PATH = CompilerConfigurationKey<String>("$PLUGIN_ID.reflektMeta")
    val LIBRARY_TO_INTROSPECT = CompilerConfigurationKey<List<String>>("$PLUGIN_ID.libraryToIntrospect")
}