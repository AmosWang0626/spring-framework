package com.amos.single.custom;

import com.amos.single.service.AmosService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 模块名称: spring
 * 模块描述: 自定义 BeanFactoryPostProcessor
 *
 * @author amos.wang
 * @date 2020/4/7 14:24
 */
@Component
public class AmosBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition)
				beanFactory.getBeanDefinition("indexService");
		// 偷梁换柱
		beanDefinition.setBeanClass(AmosService.class);
	}

}
