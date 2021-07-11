package com.gaohwang.mybatis.test;

import com.gaohwang.mybatis.config.MybatisConfig;
import com.gaohwang.mybatis.model.StudentModel;
import com.gaohwang.mybatis.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Author: gaoh
 * @Date: 2021/3/28 22:29
 * @Version: 1.0
 */
@Slf4j
public class SpringMybatisTest {

	@Test
	public void test() {
		log.info("info");
		log.debug("debug");
		System.out.println("123");
	}

	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MybatisConfig.class);
		StudentService studentService = context.getBean(StudentService.class);
		//查询
		log.info("data:{}", studentService.list());
		StudentModel model = new StudentModel();
		model.setAge(20);
		model.setName("gaoh");
		model.setRemark("remarks");
		//插入
		studentService.insert(model);
		log.info("data:{}", studentService.list());

		//删除
//		log.info("data:{}", studentService.delete(null));
//		log.info("data:{}", studentService.list());
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		lock.unlock();
	}
}
