package com.dowell.service.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author nanbo
 * @description 运行
 * @create 2018-11-08
 **/
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

		BeanWayService beanWayService = context.getBean(BeanWayService.class);

		JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

		context.close();
	}
}
