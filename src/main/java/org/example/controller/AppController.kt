package org.example.controller

import org.example.annotation.AppComponent
import org.example.annotation.BeanInject
import org.example.service.IAppService
import org.example.service.IUserService

@AppComponent
class AppController {
    @BeanInject
    @JvmField
    var service: IAppService? = null

    @BeanInject
    @JvmField
    var userService: IUserService? = null
}