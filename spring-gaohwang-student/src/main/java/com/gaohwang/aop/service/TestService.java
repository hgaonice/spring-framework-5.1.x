package com.gaohwang.aop.service;

import com.gaohwang.aop.aop.AnnotationTest;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: gaoh
 * @Date: 2021/3/3 20:01
 * @Version: 1.0
 */
@Component
public class TestService {
	@AnnotationTest
	public void test() {
		System.out.println("Test");
	}
}
