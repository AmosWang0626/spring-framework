package com.amos.single.test;

import com.amos.single.config.AppConfig;
import com.amos.single.service.AmosService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 模块名称: spring
 * 模块描述: 自定义 BeanFactoryPostProcessor
 * >>> 替换 BeanClass，暂不支持替换 BeanName
 *
 * @author amos.wang
 * @date 2020/4/7 14:56
 */
public class CustomBeanFactoryPostProcessorTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");

		System.out.println("context.getBean(xxx) By Class [AmosService.class]: " + context.getBean(AmosService.class));
		System.out.println("context.getBean(xxx) By Name [indexService]: " + context.getBean("indexService"));
		System.out.println("context.getBean(xxx) By Name [amosService]: " + context.getBean("amosService"));
	}

}
