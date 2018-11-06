package com.dowell.service.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author nanbo
 * @description
 * @create 2018-11-07
 **/
public class MainTwo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		UseFunctionTwoService useFunctionTwoService = context.getBean(UseFunctionTwoService.class);

		System.out.println(useFunctionTwoService.SayHello("java config"));

		context.close();
	}
}
