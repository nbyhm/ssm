package com.dowell.service.function.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author nanbo
 * @description 配置类
 * 1.@Configuration 声明当前类是一个配置类
 * 2.使用@ComponentScan，自动扫描包名下所有使用 @Service、@Component、@Repository、@Controller的类，并注册为Bean、
 * @create 2018-11-07
 **/
@Configuration
@ComponentScan("com.dowell.service.function")
public class FunctionConfig {

}
