package com.amos.base.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * DESCRIPTION: 生命周期回调测试
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/12
 */
@Component
public class CallbackService implements InitializingBean, ApplicationContextAware {

	public CallbackService() {
		System.out.println("init " + this.getClass().getName());
	}

	@PostConstruct
	public void callback() {
		System.out.println(this.getClass().getName() + "生命周期初始化回调方法 @PostConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this.getClass().getName() + "生命周期初始化回调方法 InitializingBean#afterPropertiesSet");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(this.getClass().getName() + "#setApplicationContext");
	}

}
