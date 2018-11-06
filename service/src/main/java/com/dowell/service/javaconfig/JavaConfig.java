package com.dowell.service.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author nanbo
 * @description 配置类
 * 1 .使用@Configuration注解表明当前类是一个配置类，这意味着这个类里可能有0个或多个@Bean注解，此处没有使用包扫描，
 * 是因为所有的 Bean 都在此类中定义了。
 * @create 2018-11-07
 **/
// 1
@Configuration
public class JavaConfig {

	/**
	 * 2. 使用 @Bean 注解声明当前方法 FunctionTwoService 的返回值是一个 Bean, Bean 的名称是方法名。
	 */
	@Bean
	public FunctionTwoService functionTwoService(){
		return new FunctionTwoService();
	}

	@Bean
	public UseFunctionTwoService useFunctionTwoService(){
		UseFunctionTwoService useFunctionTwoService = new UseFunctionTwoService();
		// 3. 注入FunctionTwoService 的 Bean 时侯直接调用 functionTwoService()。
		useFunctionTwoService.setFunctionTwoService(functionTwoService());
		return useFunctionTwoService;
	}

	/**
	 * 4. 另外一种注入的方式，直接将 FunctionTwoService 作为参数给 useFunctionTwoService(),这也是
	 *   Spring容器提供的极好的功能。在Spring容器中，只要容器中存在某个Bean,就可以在另外一个Bean的声明方法的参数中写入。
	 * @param functionTwoService
	 * @return
	 */
	@Bean
	public UseFunctionTwoService useFunctionTwoService(FunctionTwoService functionTwoService){
		UseFunctionTwoService useFunctionTwoService = new UseFunctionTwoService();
		useFunctionTwoService.setFunctionTwoService(functionTwoService);
		return useFunctionTwoService;
	}
}
