package org.example.controller

import org.example.annotation.AppComponent
import org.example.annotation.BeanInject
import org.example.service.IAppService
import org.example.service.IUserService
import org.example.service.impl.UserServiceImpl

@AppComponent
class AppController {
    @BeanInject
    private val service: IAppService? = null

    @BeanInject
    @JvmField
    val userService: UserServiceImpl? = null
}