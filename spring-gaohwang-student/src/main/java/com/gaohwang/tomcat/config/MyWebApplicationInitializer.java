package com.gaohwang.tomcat.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Author: GH
 * @Date: 2019/12/10 23:50
 * @Version 1.0
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("======================WebApplicationInitializer======================");
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(Config.class);
		context.refresh();

		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(context);
//		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		ServletRegistration.Dynamic registration = servletContext.addServlet("springMvc", servlet);
		registration.setLoadOnStartup(1);
//		registration.addMapping("*.do");
		registration.addMapping("/*");
	}
}
