package com.amos.base.test_factory_bean;

import com.amos.base.config.AppConfig;
import com.amos.base.test_factory_bean.bean.CustomBeanFactoryPostProcessor;
import com.amos.base.test_factory_bean.service.CustomService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 模块名称: spring
 * 模块描述: 自定义 BeanFactoryPostProcessor
 * >>> 替换 BeanClass，暂不支持替换 BeanName
 *
 * @author amos.wang
 * @date 2020/4/7 14:56
 */
public class BeanFactoryPostProcessorTest {

	/**
	 * 偷梁换柱
	 *
	 * @see CustomBeanFactoryPostProcessor
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");

		// beanFactory.getBeanDefinition("indexService").setBeanClass(CustomService.class)
		System.out.println("getBean(CustomService.class) " + context.getBean(CustomService.class));
		System.out.println("getBean(indexService) " + context.getBean("indexService"));
		// 偷梁换柱还是改不了beanName滴
		System.out.println("getBean(amosService) " + context.getBean("customService"));
	}

}
