package com.dowell.service.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author nanbo
 * @description 需要被注入的 Bean
 * @create 2018-11-07
 **/
@Service
public class DemoService {

	//此处为注入普通字符串
	@Value("其他类的属性")
	private String another;

	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = another;
	}
}
