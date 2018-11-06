package com.dowell.service.demo;

import com.dowell.service.config.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author nanbo
 * @description
 * @create 2018-11-07
 **/
public class DemoMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

		DemoMehodService demoMehodService = context.getBean(DemoMehodService.class);

		demoAnnotationService.add();

		demoMehodService.add();

		context.close();
	}
}
