package org.example.controller

import org.example.annotation.AppComponent
import org.example.annotation.BeanInject
import org.example.service.IAppService
import org.example.service.IUserService

@AppComponent
class AppController {
    @BeanInject
    var service: IAppService? = null

    @BeanInject
    var userService: IUserService? = null
}