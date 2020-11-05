package com.example.threadsafe.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(value = "prototype") // 加上@Scope注解，他有2个取值：单例-singleton 多实例-prototype
public class TestControllerWithPrototype {

    private int var = 0;

    @GetMapping(value = "/test_var_prototype")
    public String test() {
        System.out.println("普通变量var:" + (++var));
        return "普通变量var:" + var ;
    }
}
