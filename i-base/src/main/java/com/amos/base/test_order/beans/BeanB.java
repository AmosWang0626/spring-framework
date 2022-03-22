package com.amos.base.test_order.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Bean
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2022/3/22
 */
@Component
@Order(10003)
public class BeanB extends BaseOrder {

	public BeanB() {
		System.out.println(this.getClass());
	}

	@PostConstruct
	public void post() {
		System.out.println("finish: " + this.getClass());
	}
}
