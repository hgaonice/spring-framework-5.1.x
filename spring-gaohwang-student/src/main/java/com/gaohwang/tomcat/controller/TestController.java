package com.gaohwang.tomcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: GH
 * @Date: 2019/12/10 23:54
 * @Version 1.0
 */
@Controller
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		System.out.println("test");
		return "123";
	}
}
