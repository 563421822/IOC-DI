package org.example.controller;

import org.example.annotation.AppComponent;
import org.example.annotation.BeanInject;
import org.example.service.IAppService;
import org.example.service.IUserService;

@AppComponent
public class AppController {
    @BeanInject
    IAppService service;
    @BeanInject
    IUserService userService;
}
