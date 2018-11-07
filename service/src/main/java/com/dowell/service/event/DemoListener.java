package com.dowell.service.event;

import org.springframework.stereotype.Component;

/**
 * @author nanbo
 * @description 事件监听器
 * 实现ApplicationListener接口，并指定监听的事件类型
 * implements ApplicationListener<DemoEvent>
 * @create 2018-11-08
 **/
@Component
public class DemoListener{


	/**
	 * 使用onApplicationEvent方法对消息进行接受处理
	 * @param demoEvent
	 */
	/*@Override
	public void onApplicationEvent(DemoEvent demoEvent) {
		String msg = demoEvent.getMsg();

		System.out.println("我的（bean-demoListener）接收到了bean-demoPublisher发布的消息：" + msg);
	}*/
}
