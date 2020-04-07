package com.amos.single.custom;

import com.amos.single.service.AmosService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 模块名称: spring
 * 模块描述: AmosFactoryBean
 *
 * @author amos.wang
 * @date 2020/4/7 16:56
 */
@Component
public class AmosServiceFactoryBean implements FactoryBean<AmosService> {

	@Override
	public AmosService getObject() throws Exception {
		return new AmosService();
	}

	@Override
	public Class<?> getObjectType() {
		return AmosService.class;
	}
}
