package com.dowell.service.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author nanbo
 * @description 配置类
 * @create 2018-11-08
 **/
@Configuration
@ComponentScan("com.dowell.service.prepost")
public class PrePostConfig {

	/**
	 * initMethod 和 destroyMethod指定BeanWayService类的init和destroy方法在构造之后、Bean销毁之前执行。
	 * @return
	 */
	@Bean(initMethod = "init",destroyMethod = "destroy")
	BeanWayService beanWayService(){
		return new BeanWayService();
	}

	@Bean
	JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}
}
