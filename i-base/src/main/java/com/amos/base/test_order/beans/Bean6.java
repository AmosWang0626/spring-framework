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
@Order(2147483646)
public class Bean6 extends BaseOrder {

	public Bean6() {
		System.out.println(this.getClass());
	}

	@PostConstruct
	public void post() {
		System.out.println("finish: " + this.getClass());
	}
}
