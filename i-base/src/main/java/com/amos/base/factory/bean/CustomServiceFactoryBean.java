package com.amos.base.factory.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 模块名称: spring
 * 模块描述: AmosFactoryBean
 *
 * @author amos.wang
 * @date 2020/4/7 16:56
 */
//@Component
public class CustomServiceFactoryBean implements FactoryBean<CustomService> {

	@Override
	public CustomService getObject() throws Exception {
		return new CustomService();
	}

	@Override
	public Class<?> getObjectType() {
		return CustomService.class;
	}
}
