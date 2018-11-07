# ssm
**`Spring讲解`**
----------------------------
**`1.3  Spring 基础配置`**
- Spring 框架本身有四大原则
- 1）使用POJO进行轻量级和最小侵入式开发。
- 2）通过依赖注入和基于接口编程实现松耦合。
- 3）通过AOP和默认习惯进行声明式编程。
- 4）使用AOP和模板（template）减少模式化代码。
- Spring所有功能的设计和实现都是基于此四大原则的。

**`1.3.1  依赖注入`**
- 1.依赖注入的主要目的是为了解耦，体现了一种“组合”的理念。继承一个父类，子类将与父类耦合，
组合另一个类则使耦合度大大降低。

  Spring IoC容器（ApplicationContext）负责创建Bean,并通过容器将功能类Bean注入到你需要的Bean中。
Spring提供使用xml、注解、Java配置、groovy配置实现Bean的创建和注入。无论是xml配置、注解配置还是Java配置，都被称为配置元数据，所谓元数据既描述数据的数据。元数据
本身不具备任何可执行的能力，只能通过外界代码来对这些元数据行解析后进行有意义操作。Spring容器
解析这些配置元数据进行Bean初始化、配置和管理依赖。
<br/>
***`声明 Bean 的注解`***
- 1. @Component组件，没有明确的角色
- 2. @Service 在业务逻辑层（service层）使用
- 3. @Repository在数据访问层（dao层）使用
- 4. @Controller在展现层（MVC->Spring MVC）使用
<br>
**注入Bean的注解，一般情况下通用**
- 1. @Autowired: Spring提供的注解。
- 2. @Inject: JSR-330提供的注解。
- 3. @Resource: JSR-250提供的注解。
@Autowired、@Inject、@Resource可注解在set方法上或者属性上，笔者习惯注解在属性上，
优点是代码更少、层次更清晰。

使用@Service注解声明当前 FunctionServiceImpl 类是Spring管理的一个Bean。其中，使用
@Component、@Service、@Repository、@Controller是等效的，可根据需要选用。
<br>
**1.3.2 Java配置**
1. Java配置是Spring4.x推荐的配置方式，可以完全替代xml配置；
Java配置是通过 @Configuration 和 @Bean 来实现的。
- @Configuration 声明当前类是一个配置类，相当于一个Spring配置的xml文件。
- @Bean 注解在方法上，声明当前方法的返回值为一个Bean。
原则：全局配置使用Java 配置（如数据库相关配置、MVC相关配置），业务Bean 的配置使用注解配置
（@Service、@Component、@Repository、@Controller）。

**`1.3.3 AOP`**
- 1.AOP：面向切面编程，相对于 OOP 面向对象编程。
Spring 的 AOP 的存在目的是为了解耦。AOP可以让一组类共享相同的行为。在 OOP中只能通过继承类和实现接口，
来使代码的耦合度增强，且类继承只能为单继承，阻碍更多行为添加到一组类上，AOP弥补了OOP的不足。
<br>
 Spring 支持AspectJ的注解式切面编程。<br>
 （1）使用 @AspectJ的注解式切面编程
 （2）使用@After、@Before、@Around 定义建言（advice）,可直接将拦截规则（切点）作为参数。
 （3）其中@After、@Before、@Around 参数的拦截规则为切点（PointCut）,为了使切点复用，可使用@PointCut
 专门定义拦截规则，然后在@After、@Before、@Around 的参数中调用。
 （4）其中符合条件的每个被拦截处为连接点 （JoinPoint）
 其中注解式拦截能很好地控制要拦截的粒度和获取更丰富的信息，Spring本身在事务处理（@Transcational）
 和数据缓存（@Cacheable等）上面都使用此种形式的拦截。
 
**`2.1 Bean 的 Scope`**
- 2.1.1
  Scope描述的是Spring容器如何新建Bean的实列的。通过@Scope注解来实现
（1）Singleton:一个Spring容器中只有一个Bean的实列，此为Spring的默认配置，全容器共享
一个实例。
（2）Prototype：每次调用新建一个Bean的实例。
（3）Request：Web项目中，给每个http request新建一个Bean实列。
（4）Session：Web项目中，给每个http 实例。
（5）GlobalSession：这个只在portal应用中有用，给每一个global http session新建一个Bean实例。

**`2.2 Spring EL 和资源调用`**
- Spring主要在注解@Value的参数中使用表达式。

**`2.3 Bean 的初始化和销毁`**
2.3.1 Spring 对 Bean的生命周期的操作提供了支持。
-（1）Java配置方式：使用@Bean 的 initMethod 和 destroyMethod
 (相当于xml配置的init-method 和 destroy-method)
-(2)注解方式：利用 JSR-250的@PostConstruct和@PreDestroy。

**`2.4 Profile`**
- Profile 为不同环境下使用不同的配置提供了支持，在开发中使用@Profile注解类或者方法，
达到在不同的环境下选择实例化不同的Bean。

**2.5 事件（Application Event）**
- Spring 的事件（Application Event）为Bean 与 Bean 之间的消息提供了支持。当一个Bean
处理完一个任务后，希望另一个Bean知道并能相应的处理，这时我们就需要让另外一个Bean
监听当前Bean所发送的事件。
Spring 的事件需要遵循如下流程：
（1）自定义事件，集成ApplicationEvent。
（2）自定义监听器，实现ApplicationListener。
（3）使用容器发布事件。





* author: NanGe 
[github]:https://github.com
>数据结构  
>>树  
>>>二叉树  
>>>>平衡二叉树  
>>>>>满二叉树 

public class Main {

	public static void main(String[] args) {

		// 使用 AnnotationConfigApplicationContext 作为Spring容器，接受输入一个配置类作为参数；
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FunctionConfig.class);

		//获得声明配置的 UseFunctionService 的 Bean
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

		System.out.println(useFunctionService.SayHello("di"));

		context.close();
	}
}

