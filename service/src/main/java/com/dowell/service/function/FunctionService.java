package com.dowell.service.function;

import org.springframework.stereotype.Service;

/**
 * @author nanbo
 * @description 编写功能类的Bean
 * 1.使用@Service注解声明当前 FunctionService 类是Spring管理的一个Bean.
 * @create 2018-11-06
 **/
@Service
public class FunctionService {

	public String sayHello(String word){
		return "Hello " + word + " !";
	}
}
