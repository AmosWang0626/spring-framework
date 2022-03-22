package com.amos.base.test_order.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Bean
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2022/3/22
 */
@Component
public class Bean4 extends BaseOrder {

	public Bean4() {
		System.out.println(this.getClass());
	}

	@PostConstruct
	public void post() {
		System.out.println("finish: " + this.getClass());
	}
}
