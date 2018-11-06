package com.dowell.service.javaconfig;

/**
 * @author nanbo
 * @description 编写功能类的Bean
 * 此处没有使用 @Service 声明 Bean
 * @create 2018-11-06
 **/
public class FunctionTwoService {

	public String sayHello(String word){
		return "Hello " + word + " !";
	}
}
