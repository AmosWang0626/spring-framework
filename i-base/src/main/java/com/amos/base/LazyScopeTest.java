package com.amos.base;

import com.amos.base.config.AppConfig;
import com.amos.base.service.IndexService;
import com.amos.base.service.LazyService;
import com.amos.base.service.ProtoTypeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * LazyScopeTest
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/12
 */
public class LazyScopeTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");

		System.out.println("BeanDefinitionCount: " + context.getBeanDefinitionCount());
		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
			System.out.println("\tBeanDefinitionName >>> " + beanDefinitionName);
		}
		System.out.println();

		// 默认初始化时加载; Lazy getBean时加载; ProtoType getBean时加载, 每次getBean都创建新的;
		System.out.println(">>>>> IndexService Bean: " + context.getBean(IndexService.class));
		System.out.println(">>>>> IndexService Bean: " + context.getBean(IndexService.class));
		System.out.println();

		System.out.println(">>>>> LazyService Bean: " + context.getBean(LazyService.class));
		System.out.println(">>>>> LazyService Bean: " + context.getBean(LazyService.class));
		System.out.println();

		System.out.println(">>>>> ProtoTypeService Bean: " + context.getBean(ProtoTypeService.class));
		System.out.println(">>>>> ProtoTypeService Bean: " + context.getBean(ProtoTypeService.class));

	}

}
