package com.gaohwang.dependency.test;

import com.gaohwang.dependency.bean.Aa;
import com.gaohwang.dependency.bean.Bb;
import com.gaohwang.dependency.config.Config;
import org.openjdk.jol.info.ClassLayout;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: gaoh
 * @Date: 2021/3/4 16:41
 * @Version: 1.0
 */
public class DependencyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Aa a = applicationContext.getBean(Aa.class);
        Bb b = applicationContext.getBean(Bb.class);
        System.out.println(a);
        System.out.println(b);
        //NoUniqueBeanDefinitionException
        Object o = new Object();
		System.out.println(ClassLayout.parseInstance(o).toPrintable());

    }
}
