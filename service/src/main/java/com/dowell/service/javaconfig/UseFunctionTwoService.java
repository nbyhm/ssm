package com.dowell.service.javaconfig;

import com.dowell.service.function.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nanbo
 * @description 使用功能类的Bean
 * 此处没有使用 @Service 声明 Bean
 * @create 2018-11-07
 **/

public class UseFunctionTwoService {

	/**
	 * 此处没有使用 @Autowired 注解注入 Bean
	 */
	FunctionTwoService functionTwoService;

	public void setFunctionTwoService(FunctionTwoService functionTwoService) {
		this.functionTwoService = functionTwoService;
	}

	public String SayHello(String word){
		return functionTwoService.sayHello(word);
	}
}
