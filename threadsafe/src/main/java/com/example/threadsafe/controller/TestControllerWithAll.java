package com.example.threadsafe.controller;

import com.example.threadsafe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(value = "singleton") // prototype singleton
public class TestControllerWithAll {

    private int var = 0; // 定义一个普通变量

    private static int staticVar = 0; // 定义一个静态变量

    @Value("${test-int}")
    private int testInt; // 从配置文件中读取变量

    ThreadLocal<Integer> tl = new ThreadLocal<>(); // 用ThreadLocal来封装变量

    @Autowired
    private User user; // 注入一个对象来封装变量

    @GetMapping(value = "/test_var_all")
    public String test() {
        tl.set(1);
        System.out.println("先取一下user对象中的值："+user.getAge()+"===再取一下hashCode:"+user.hashCode());
        user.setAge(1);
        System.out.println("普通变量var:" + (++var) + "===静态变量staticVar:" + (++staticVar) + "===配置变量testInt:" + (++testInt)
                + "===ThreadLocal变量tl:" + tl.get()+"===注入变量user:" + user.getAge());
        return "普通变量var:" + var + ",静态变量staticVar:" + staticVar + ",配置读取变量testInt:" + testInt + ",ThreadLocal变量tl:"
                + tl.get() + "注入变量user:" + user.getAge();
    }
}
