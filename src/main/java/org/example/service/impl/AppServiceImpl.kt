package org.example.service.impl

import org.example.annotation.AppComponent
import org.example.annotation.BeanInject
import org.example.service.IAppService
import org.example.service.IUserService

@AppComponent
open class AppServiceImpl : IAppService {
    @BeanInject
    @JvmField
    var userService: IUserService? = null
}