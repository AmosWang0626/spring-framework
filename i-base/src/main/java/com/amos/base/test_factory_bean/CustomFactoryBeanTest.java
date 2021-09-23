package com.amos.base.test_factory_bean;

import com.amos.base.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 模块描述: FactoryBean
 *
 * @author amos.wang
 * @date 2020/4/7 14:56
 */
public class CustomFactoryBeanTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");

		// 默认拿到的是 CustomServiceFactoryBean#getObject拿到的对象
		System.out.println(context.getBean("customServiceFactoryBean"));
		// 要想拿到的 CustomServiceFactoryBean&
		System.out.println(context.getBean("&customServiceFactoryBean"));
	}

}
