package com.dowell.service.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author nanbo
 * @description
 * @create 2018-11-08
 **/
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

		//DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

		//demoPublisher.publish("hello application event");
		context.close();
	}
}
