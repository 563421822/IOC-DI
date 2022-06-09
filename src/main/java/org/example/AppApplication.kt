package org.example

import kotlin.jvm.JvmStatic
import org.example.config.Starter

object AppApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        Starter.run(AppApplication::class.java, args)
    }
}