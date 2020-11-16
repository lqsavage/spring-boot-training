package com.example.bootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author savagelee
 * @CreateDate 11/12/2020
 * @Description: Spring Boot with dockerfile demonstration
 */

@RestController
public class TestController {

    @GetMapping("/docker")
    public String getTest(){
        return "Docker 测试……";
    }
}
