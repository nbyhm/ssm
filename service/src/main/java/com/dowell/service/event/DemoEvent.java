package com.dowell.service.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author nanbo
 * @description 自定事件
 * @create 2018-11-08
 **/
public class DemoEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;
	private String msg;

	public DemoEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
