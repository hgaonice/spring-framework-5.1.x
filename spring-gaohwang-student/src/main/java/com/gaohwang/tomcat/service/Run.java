package com.gaohwang.tomcat.service;

import org.apache.catalina.Context;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

/**
 * @Author: GH
 * @Date: 2019/12/10 23:43
 * @Version 1.0
 */
public class Run {

	public static void run() {
		/*Tomcat tomcat = new Tomcat();
		tomcat.setPort(6666);
		tomcat.addWebapp("/", "d:\\logs\\");
//		tomcat.addContext("/", "d:\\logs\\");
		try {
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}*/


		Tomcat tom = new Tomcat();
		tom.setPort(6666);
		try {

//			File file = new File(System.getProperty("java.io.tmpdir"));
			//获取项目编译后的claess 路径
			String path = Run.class.getResource("/").getPath();

			//获取webapp 文件
			String filePath = new File("src/main/webapp").getAbsolutePath();

			//然后将webapp下的项目添加至tomcat的context容器（context对应一个运行的项目）
			//Context context =tom.addWebapp("/",filePath); //参数1：一般是项目名 对应请求url中的项目名
			Context context = tom.addContext("/", filePath);

			//webResourceRoot 用于加载 项目的class文件
			WebResourceRoot webResource = new StandardRoot(context);
			webResource.addPreResources(new DirResourceSet(webResource, "/WEB-INF/classes", path, "/"));
			// tomcat启动
			tom.start();
			//阻塞 ，等待前端连接 tom.getServer().await();
			tom.getServer().await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
