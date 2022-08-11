package org.example.controller

import org.example.annotation.AppComponent
import org.example.annotation.BeanInject
import org.example.service.IAppService
import org.example.service.IUserService

@AppComponent
open class UserController {
    @BeanInject
    @JvmField
    val service: IAppService? = null

    @BeanInject
    @JvmField
    var userService: IUserService? = null
}