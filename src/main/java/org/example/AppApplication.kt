package org.example

import org.example.annotation.AppComponent
import org.example.annotation.BeanInject
import org.example.config.Starter.Companion.run
import org.example.controller.UserController

@AppComponent
object AppApplication {
    @BeanInject
    @JvmField
    var userController: UserController? = null

    @JvmStatic
    fun main(args: Array<String>) {
        run(AppApplication::class.java, args)
        println(userController!!.service)
    }
}