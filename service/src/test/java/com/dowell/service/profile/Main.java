package com.dowell.service.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author nanbo
 * @description
 * @create 2018-11-08
 **/
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		//先将活动的 Profile 设置为 prod
		context.getEnvironment().setActiveProfiles("prod");
		//后置注册 Bean 配置类，不然会报Bean未定义的错误
		context.register(ProfileConfig.class);
		//刷新容器
		context.refresh();

		DemoBean demoBean = context.getBean(DemoBean.class);

		System.out.println(demoBean.getContent());

		context.close();

	}


}
