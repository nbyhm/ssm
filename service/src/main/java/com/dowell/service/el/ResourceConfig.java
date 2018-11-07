package com.dowell.service.el;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author nanbo
 * @description
 * @create 2018-11-07
 **/
@Configuration
//@ComponentScan("com.dowell.service.el")
public class ResourceConfig {

	@Bean
	public DemoService demoService(){
		return new DemoService();
	}
}
