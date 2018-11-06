package com.dowell.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author nanbo
 * @description 配置类
 *  使用@EnableAspectJAutoProxy 注解开启Spring对 AspectJ 代理的支持
 * @create 2018-11-07
 **/
@Configuration
@ComponentScan("com.dowell.service")
@EnableAspectJAutoProxy
public class AopConfig {

}
