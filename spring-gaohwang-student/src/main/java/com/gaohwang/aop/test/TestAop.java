package com.gaohwang.aop.test;

import com.gaohwang.aop.config.Config;
import com.gaohwang.aop.dao.StudentDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: gaoh
 * @Date: 2020/9/13 9:57
 * @Version: 1.0
 */
public class TestAop {


	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		StudentDao bean = context.getBean(StudentDao.class);
		bean.student();
	}
}
