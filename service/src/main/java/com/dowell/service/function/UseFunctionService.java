package com.dowell.service.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nanbo
 * @description 使用功能类的Bean
 * @create 2018-11-07
 **/
@Service
public class UseFunctionService {

	/**
	 * 使用 @Autowired 将 FunctionService 的实体Bean 注入到 UseFunctionService 中，让UseFunctionService
	 * 具备FunctionService的功能，此处使用 JSR-330的@Inject注解或者JSR-250的 @Resource 注解是等效的。
	 */
	@Autowired
	FunctionService functionService;

	public String SayHello(String word){
		return functionService.sayHello(word);
	}
}
