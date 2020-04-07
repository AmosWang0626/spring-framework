package com.amos.single.test;

import com.amos.single.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 模块名称: spring
 * 模块描述: 自定义 FactoryBean
 *
 * @author amos.wang
 * @date 2020/4/7 14:56
 */
public class CustomFactoryBeanTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");

		// 默认拿到的是 AmosServiceFactoryBean#getObject拿到的对象
		System.out.println(context.getBean("amosServiceFactoryBean"));
		// 要想拿到的 AmosServiceFactoryBean需增加&
		System.out.println(context.getBean("&amosServiceFactoryBean"));
	}

}
