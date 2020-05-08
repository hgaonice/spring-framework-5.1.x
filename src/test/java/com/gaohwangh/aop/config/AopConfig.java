package com.gaohwangh.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: GH
 * @Date: 2020/2/13 12:51
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.gaohwangh.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
