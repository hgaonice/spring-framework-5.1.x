package com.gaohwangh.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: GH
 * @Date: 2020/2/13 12:51
 * @Version 1.0
 */
@Aspect
@Component
public class AopAspect {

	@Pointcut("execution(*.*.com.gaohwangh.aop.service.*.*(**))")
	public void pointCut(){}


	@Around("pointCut()")
	public void Around(JoinPoint joinPoint){
		System.out.println(123);
	}


}
