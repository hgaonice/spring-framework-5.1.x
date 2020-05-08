package com.gaohwang.spring.test;

import com.gaohwang.spring.bean.X;
import com.gaohwang.spring.config.Appconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gaoh
 * @version 1.0
 * @date 2020/5/8 9:57
 */
public class TestSpring {

    @Test
    public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        X bean = applicationContext.getBean(X.class);
		System.out.println(bean);
    }
}
