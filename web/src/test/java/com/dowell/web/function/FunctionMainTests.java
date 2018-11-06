package com.dowell.web.function;

import com.dowell.service.function.UseFunctionService;
import com.dowell.service.function.config.FunctionConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author nanbo
 * @description
 * @create 2018-11-07
 **/
public class FunctionMainTests {

	public static void main(String[] args) {

		// 使用 AnnotationConfigApplicationContext 作为Spring容器，接受输入一个配置类作为参数；
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FunctionConfig.class);

		//获得声明配置的 UseFunctionService 的 Bean
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

		System.out.println(useFunctionService.SayHello("di"));

		context.close();
	}
}
