package com.dowell.service.aop;

import java.lang.annotation.*;

/**
 * 编写拦截规则的注解
 * 注解本身没有功能的，就和xml一样。注解和xml都是一种元数据，元数据即解释数据的数据，这里是所谓配置。
 * 注解的功能来自用这个注解的地方。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
	String name();
}
