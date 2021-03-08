package com.gaohwang.test.test;

import com.gaohwang.test.config.ConfigTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: GH
 * @Date: 2020/1/12 15:28
 * @Version 1.0
 */
public class TestSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(ConfigTest.class);
		applicationContext.refresh();

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanDefinitionNames) {
			System.out.println(beanName);
		}

//		Object o = new Object();
//		System.out.println(ClassLayout.parseInstance(o).toPrintable());

	}
}
