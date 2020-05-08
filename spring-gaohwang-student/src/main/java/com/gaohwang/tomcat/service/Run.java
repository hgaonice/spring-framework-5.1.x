package com.gaohwang.tomcat.service;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * @Author: GH
 * @Date: 2019/12/10 23:43
 * @Version 1.0
 */
public class Run {

	public static void run() {
		Tomcat tomcat = new Tomcat();
//		StandardHost standardHost = new StandardHost();
//		tomcat.setHost(standardHost);
		tomcat.setPort(8080);
		tomcat.addWebapp("/", "D:\\logs");
		try {
			tomcat.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
		tomcat.getServer().await();
	}
}
