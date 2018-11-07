package com.dowell.service.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author nanbo
 * @description Profile配置
 * @create 2018-11-08
 **/
@Configuration
public class ProfileConfig {

	/**
	 * Profile为dev时实例化devDemoBean
	 * @return
	 */
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean(){
		return new DemoBean("from development profile");
	}

	/**
	 * Profile为prod时实例化 prodDemoBean
	 * @return
	 */
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean(){
		return new DemoBean("from production profile");
	}
}
