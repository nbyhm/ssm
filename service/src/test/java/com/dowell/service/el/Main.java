package com.dowell.service.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author nanbo
 * @description 运行
 * @create 2018-11-07
 **/
public class Main {
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
		//
		//ElConfig resourceService = context.getBean(ElConfig.class);
		//
		//resourceService.outputResource();

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);

		DemoService demoService = context.getBean(DemoService.class);
		System.out.println(demoService.getAnother());

		ElConfig resourceService = context.getBean(ElConfig.class);

		resourceService.outputResource();

		context.close();
	}
}
