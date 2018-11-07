package com.dowell.service.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @author nanbo
 * @description 演示配置类
 * @create 2018-11-07
 **/
@Configuration
@ComponentScan("com.dowell.service.el")
@PropertySource("classpath:el/test.properties")
public class ElConfig {
	//注入普通字符串
	@Value("I Love You!")
	private String normal;

	//注入操作系统属性
	@Value("#{systemProperties['os.name']}")
	private String osName;

	//注入表达式结果
	@Value("#{ T(java.lang.Math).random() * 100.0}")
	private double randomNumber;

	//注入其他Bean属性
	@Value("#{domeService.another}")
	private String fromAnother;

	//注入文件资源
	@Value("classpath:el/test.properties")
	private Resource testFile;

	//注入网址资源
	@Value("http://www.baidu.com")
	private Resource testUrl;

	//注入配置文件
	@Value("${book.name}")
	private String bookName;

	//注入配置文件
	@Autowired
	private Environment environment;

	//注入配置文件
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
		return new PropertySourcesPlaceholderConfigurer();
	}

	public void outputResource(){
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);

			System.out.println(IOUtils.toString(testFile.getInputStream()));

			System.out.println(IOUtils.toString(testUrl.getInputStream()));

			System.out.println(environment.getProperty("book.author"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
