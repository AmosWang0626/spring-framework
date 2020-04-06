package com.amos.single;

import com.amos.single.config.AppConfig;
import com.amos.single.service.IndexService;
import com.amos.single.service.LazyService;
import com.amos.single.service.ProtoTypeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * 模块名称: 源码测试
 * 模块描述: 源码测试
 *
 * @author amos.wang
 * @date 2020/3/24 13:18
 */
public class SingleApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");

		System.out.println("BeanDefinitionCount: " + context.getBeanDefinitionCount());
		System.out.println("BeanDefinitionNames: " + Arrays.toString(context.getBeanDefinitionNames()));

		// 默认初始化时加载; Lazy getBean时加载; ProtoType getBean时加载, 每次getBean都创建新的;
		System.out.println(">>>>> IndexService Bean: " + context.getBean(IndexService.class));
		System.out.println(">>>>> IndexService Bean: " + context.getBean(IndexService.class));
		System.out.println(">>>>> LazyService Bean: " + context.getBean(LazyService.class));
		System.out.println(">>>>> LazyService Bean: " + context.getBean(LazyService.class));
		System.out.println(">>>>> ProtoTypeService Bean: " + context.getBean(ProtoTypeService.class));
		System.out.println(">>>>> ProtoTypeService Bean: " + context.getBean(ProtoTypeService.class));
	}

}
