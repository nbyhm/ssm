package com.dowell.service.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author nanbo
 * @description 编写Prototype 的 Bean
 * 1.声明Scope 为 prototype
 * @create 2018-11-07
 **/
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
