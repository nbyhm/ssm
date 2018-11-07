package com.dowell.service.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author nanbo
 * @description 使用JSR250形式的 Bean
 * @create 2018-11-08
 **/
public class JSR250WayService {

	/**
	 * @PostConstruct，在构造函数执行完之后执行
	 */
	@PostConstruct
	public void init(){
		System.out.println("jsr250-init-method");
	}

	public JSR250WayService(){
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}

	/**
	 * @PreDestroy，在Bean销毁之前执行
	 */
	@PreDestroy
	public void destroy(){
		System.out.println("jsr250-destroy-method");
	}
}
