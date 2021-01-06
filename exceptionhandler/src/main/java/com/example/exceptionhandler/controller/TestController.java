package com.example.exceptionhandler.controller;

import com.example.exceptionhandler.util.ReturnedObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/exception")
    public String getTest(){
        return "Exception 测试……";
    }

    @GetMapping("/obj")
    public ReturnedObject getReturnedObject() {
        return ReturnedObject.ok("返回结果测试……").data("");
    }

    @GetMapping("/obj/error")
    public ReturnedObject getReturnedObjectWithError() {
        return ReturnedObject.error();
    }
}
