package com.zjrc.springaop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjrc.springaop.common.aop.ControllerWebLog;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/getOne")
	@ControllerWebLog(name = "查询", intoDb = true)
	public String getOne(Long id, String name) {

		return "1234";
	}
}
