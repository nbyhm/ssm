package com.dowell.service.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author nanbo
 * @description 事件法布类
 * @create 2018-11-08
 **/
@Component
public class DemoPublisher {

	//注入 ApplicationContext 用来发布事件
	@Autowired
	ApplicationContext applicationContext;

	//使用ApplicationContext的publisth方法来发布。
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
