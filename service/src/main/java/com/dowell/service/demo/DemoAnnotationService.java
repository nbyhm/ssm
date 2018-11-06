package com.dowell.service.demo;

import com.dowell.service.aop.Action;
import org.springframework.stereotype.Service;

/**
 * @author nanbo
 * @description 编写使用注解的被拦截类
 * @create 2018-11-07
 **/
@Service
public class DemoAnnotationService {

	@Action(name = "注解式拦截的add操作")
	public void add(){}
}
