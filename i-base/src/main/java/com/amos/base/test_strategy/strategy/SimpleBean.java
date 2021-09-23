package com.amos.base.test_strategy.strategy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 测试一下普通类的注入
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/8/25
 */
@Component
public class SimpleBean {

	public SimpleBean() {
		System.out.println(this.getClass());
	}

	@PostConstruct
	public void post() {
		System.out.println("PostConstruct " + this.getClass());
	}
}
