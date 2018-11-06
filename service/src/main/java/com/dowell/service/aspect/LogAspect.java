package com.dowell.service.aspect;

import com.dowell.service.aop.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author nanbo
 * @description 编写切面
 * 通过@Aspect 注解声明一个切面
 * 通过@Component 让此切面称为Spring容器管理的Bean
 * 通过@Pointcut 注解声明切点
 * 通过@After 注解声明一个建言，并使用 @Pointcut 定义的切点
 * 通过反射可获得注解上的属性，然后做日志记录相关的操作，下面相同。
 * 通过@Before 注解声明一个建言，此建言直接使用拦截规则作为参数。
 * @create 2018-11-07
 **/
@Aspect
@Component
public class LogAspect {

	@Pointcut("@annotation(com.dowell.service.aop.Action)")
	public void annotationPointCut(){}

	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();

		Method method = signature.getMethod();

		Action action = method.getAnnotation(Action.class);

		System.out.println("注解式拦截 " + action.name());
	}

	@Before("execution(* com.dowell.service.demo.DemoMehodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();

		Method method = signature.getMethod();

		System.out.println("方法规则式拦截," + method.getName());
	}
}
